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

    @GetMapping("/add")
    public TodoItem add() {
        TodoItem item = new TodoItem();
        item.title= "hoge2";
        item.body = "hogebody2";
        return todoRepository.save(item);
    }


}
