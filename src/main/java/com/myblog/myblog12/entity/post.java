package com.myblog.myblog12.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="posts")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String description;

    private String content;





}
