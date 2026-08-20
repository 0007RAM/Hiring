package com.ram.HiringPlatform.repository;

import com.ram.HiringPlatform.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
