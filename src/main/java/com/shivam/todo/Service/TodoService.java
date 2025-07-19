package com.shivam.todo.Service;

import com.shivam.todo.Model.Todo;
import com.shivam.todo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {


    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodoList(){
        return todoRepository.findAll();
    }

    public Boolean saveTodoList(Todo todo){
       return todoRepository.save(todo).getCompleted();
    }

}
