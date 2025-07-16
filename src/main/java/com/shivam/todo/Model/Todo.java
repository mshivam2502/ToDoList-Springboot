package com.shivam.todo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private Boolean completed;
    @UpdateTimestamp
    private LocalDateTime lastModified;
    @CreationTimestamp
    private LocalDateTime insertDate;

    public Todo() {
    }

    public Todo(Integer id, String title, String description, Boolean completed, LocalDateTime lastModified, LocalDateTime insertDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.lastModified = lastModified;
        this.insertDate = insertDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }
}
