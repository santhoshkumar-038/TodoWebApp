package com.santhosh.todowebapp.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.santhosh.todowebapp.todo.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;
	static {
		todos.add(new Todo(++todoCount, "santhosh", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "in28Minutes", "Learn GCP", LocalDate.now().plusYears(2), false));
	}
	
	public List<Todo> getTodosByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todoCount, username, description, targetDate, done);
		todos.add(todo);
	}

}
