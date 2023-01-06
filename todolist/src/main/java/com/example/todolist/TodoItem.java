package com.example.todolist;

import jakarta.persistence.*;


@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;

    public String body;

    public boolean isCompleted = false;
}
