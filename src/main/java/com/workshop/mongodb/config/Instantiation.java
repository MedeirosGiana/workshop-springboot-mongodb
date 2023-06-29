package com.workshop.mongodb.config;

import com.workshop.mongodb.domain.Post;
import com.workshop.mongodb.domain.User;
import com.workshop.mongodb.dto.AuthorDTO;
import com.workshop.mongodb.repository.PostRepository;
import com.workshop.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
       userRepository.deleteAll();
       postRepository.deleteAll();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob));
        Post post1 = new Post(null,sdf.parse("10/02/2023"),"Partiu viajem!","Vou viajar para São Paulo, abraços.",new AuthorDTO(maria));
        Post post2 = new Post(null,sdf.parse("30/03/2023"),"Bom dia!","Acordei feliz hoje!",new AuthorDTO(maria));

        postRepository.saveAll(Arrays.asList(post1,post2));

        maria.getPosts().addAll(Arrays.asList(post1,post2));
        userRepository.save(maria);

    }
}
