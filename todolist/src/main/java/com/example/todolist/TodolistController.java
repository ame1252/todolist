package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping("/{id}/complete")
    public int complete(@PathVariable long id) {
        String query = "UPDATE todo_item SET is_completed = true WHERE id = ?";
        return jdbcTemplate.update(query, id);
    }

    @PostMapping("/{id}/delete")
    public int delete(@PathVariable long id) {
        String query = "DELETE FROM todo_item WHERE id = ?";
        return jdbcTemplate.update(query, id);
    }
}
