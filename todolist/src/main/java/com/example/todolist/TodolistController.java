package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@RestController
public class TodolistController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public List<TodoItem> getAll() {
        String query = "SELECT * from todo_item";
        TodoItemRowMapper rowMapper = new TodoItemRowMapper();
        return jdbcTemplate.query(query, rowMapper);
    }

}
