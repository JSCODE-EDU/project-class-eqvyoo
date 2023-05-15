package com.example.cyj.jsproject.repository;

import com.example.cyj.jsproject.DTO.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {


}
