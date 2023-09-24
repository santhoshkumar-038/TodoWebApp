package com.santhosh.todowebapp.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.santhosh.todowebapp.todo.Todo;
import com.santhosh.todowebapp.todo.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	public TodoService getTodoService() {
		return todoService;
	}

	public void setTodoService(TodoService todoService) {
		this.todoService = todoService;
	}

	@GetMapping("todo-lists")
	public String findAllTodos(ModelMap model) {
		List<Todo> todos = todoService.getTodosByUsername("santhosh");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
	
	@GetMapping("add-todo")
	public String showNewTodoPage() {
		return "todo";
	}
	
	@PostMapping("add-todo")
	public String addNewTodoPage(@RequestParam String description, ModelMap model) {
		String username = (String) model.get("name");
		todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
		return "redirect:todo-lists";
	}
}
