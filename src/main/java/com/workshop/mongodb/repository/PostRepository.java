package com.workshop.mongodb.repository;

import com.workshop.mongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);//consulta de posts
}
