package com.Gaurav.JobListing.repository;

import com.Gaurav.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
