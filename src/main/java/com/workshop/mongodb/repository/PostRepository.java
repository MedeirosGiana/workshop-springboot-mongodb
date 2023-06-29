package com.workshop.mongodb.repository;

import com.workshop.mongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
