package com.example.todolist;


/**
 * Tableと同じ構造のClassを用意する
 */
public class TodoItem {

    public Long id;

    public String title;

    public String body;

    public boolean isCompleted;

    TodoItem(
        Long id,
        String title,
        String body,
        boolean isCompleted
    ) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.isCompleted = isCompleted;
    }
}
