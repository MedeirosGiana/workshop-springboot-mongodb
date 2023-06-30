package com.workshop.mongodb.servicies;

import com.workshop.mongodb.domain.Post;
import com.workshop.mongodb.repository.PostRepository;
import com.workshop.mongodb.servicies.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return  obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return  repository.fullSearch(text, minDate, maxDate);
    }

}
