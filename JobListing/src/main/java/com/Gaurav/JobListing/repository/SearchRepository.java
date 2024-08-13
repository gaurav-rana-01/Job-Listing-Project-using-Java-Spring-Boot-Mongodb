package com.Gaurav.JobListing.repository;

import com.Gaurav.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
