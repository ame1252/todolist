package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodolistController {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("/")
    public List<TodoItem> getAll() {
        return todoRepository.findAll();
    }


}
