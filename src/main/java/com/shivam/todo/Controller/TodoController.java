package com.shivam.todo.Controller;

import com.shivam.todo.Model.Todo;
import com.shivam.todo.Service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/TodoApp")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(path = "/getTodoList")
    public List<Todo> getTodoList(){
        return todoService.getTodoList();
    }

}
