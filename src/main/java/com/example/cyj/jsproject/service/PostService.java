package com.example.cyj.jsproject.service;

import com.example.cyj.jsproject.DTO.Post;
import com.example.cyj.jsproject.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post save(Post post){
        return postRepository.save(post);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Post findOneById(@RequestParam Long id) {
        return postRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("존재하지 않는 게시물입니다."));
    }

    public void delete(long id){
        postRepository.deleteById(id);
    }


}
