package com.example.todolist;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Optional;

@Entity
@Table
public class TodoItem {

    @Id
    @Column
    public Long id;

    @Column
    public String title;

    @Column
    private String body;

    @Column
    public boolean isCompleted;
}
