package com.example.todolist;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoItemRowMapper implements RowMapper<TodoItem> {

    public Long id;

    public String title;

    public String body;

    public boolean isCompleted = false;

    @Override
    public TodoItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new TodoItem(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("body"),
                rs.getBoolean("is_completed")
        );
    }
}
