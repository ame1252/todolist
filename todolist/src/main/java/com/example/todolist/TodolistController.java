package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@RestController
public class TodolistController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public List<TodoItem> getAll() {
        String query = "SELECT * FROM todo_item";
        TodoItemRowMapper rowMapper = new TodoItemRowMapper();
        return jdbcTemplate.query(query, rowMapper);
    }

    @PostMapping("/update")
    public int update(){
        String query = "UPDATE todo_item SET is_completed = true WHERE id = 2";
        return jdbcTemplate.update(query);
    }

}
