package com.example.cyj.jsproject.controller;
import com.example.cyj.jsproject.DTO.Post;
import com.example.cyj.jsproject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private PostService postService;
    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping("/write")
    public Long save(@RequestBody Post post){
        postService.save(post);
        return post.getId();
    }
    @GetMapping("/findAll")
    public List<Post> findAll(){
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public Post findOneById(@RequestParam Long id){
        return postService.findOneById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@RequestParam long id){
        postService.delete(id);
    }




}
