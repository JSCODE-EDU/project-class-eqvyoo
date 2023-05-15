package com.example.cyj.jsproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    @Column
    private String title;
    @Column
    private String content;


}
