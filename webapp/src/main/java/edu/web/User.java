package edu.web;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by R.Karimov on 11/10/17.
 */
public class User {
    private String name;
    private String email;
    private String avatarUrl;
    private List<Todo> todos;

    public User() {
        todos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void addTodo(String description, int priority) {
        todos.add(new Todo(description, priority));
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
