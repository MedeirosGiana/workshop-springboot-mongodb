package com.workshop.mongodb.repository;

import com.workshop.mongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    @Query("{'title':{$regex:?0,$options:'i'}}")
    List<Post> searchTitle(String text);//consulta de posts contendo um dado String no título
    List<Post> findByTitleContainingIgnoreCase(String text);//consulta de posts com query methods
}
