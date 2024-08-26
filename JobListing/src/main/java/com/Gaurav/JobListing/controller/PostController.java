package com.Gaurav.JobListing.controller;

import com.Gaurav.JobListing.repository.PostRepository;
import com.Gaurav.JobListing.model.Post;
import com.Gaurav.JobListing.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){

        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){

        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return repo.save(post);
    }



}
