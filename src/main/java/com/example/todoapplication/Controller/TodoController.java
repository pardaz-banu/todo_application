package com.example.todoapplication.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapplication.Service.TodoService;

import model.Todo;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//this is a API service i.e, creating APIs

@RestController
@RequestMapping("/task") // API can be seen from localhost:8080/task
public class TodoController {
	
	//private static final Logger logger = LoggerFactory.getLogger(TodoAPIService.class);
	
	//Todo tododetails;
	
	TodoService taskService;
	
	public TodoController(TodoService taskService) {
		//super();
		this.taskService = taskService;
	}
	
	//Read specific Todo task details
	@GetMapping("{id}")
	public Todo getTodoDetails(@PathVariable("taskId") String taskId) {
		return taskService.getTodoTask(taskId);
		//return tododetails;
				//new Todo("T1", "leetcode", "do leetcode everyday"); // this is how we manually add values to API
	}
	
	//Read All Todo task details available in DB
	@GetMapping("{id}")
	public List<Todo> getAllTodoDetails() {
		return taskService.getAllTodoTasks();
		//return tododetails;
				//new Todo("T1", "leetcode", "do leetcode everyday"); // this is how we manually add values to API
	}
	
	
	@PostMapping
	public String createTodoDetails(@RequestBody Todo tododetails) {
		taskService.createTodoTasl(tododetails);
		//this.tododetails = tododetails;
		return "List created successfully";
		
	}
	
	@PutMapping
	public String updateTodoDetails(@RequestBody Todo tododetails) {
		taskService.updateTodoTask(tododetails);
		//this.tododetails = tododetails;
		return "todo list is updated successfully";
	}
	
	//delete the specific task
	@DeleteMapping("{taskId}")
	public String deleteTodoDetails(@PathVariable("taskId") String taskId) {
		taskService.deleteTodoTask(taskId);
		//this.tododetails = null;
		return "todo list is deleted successfully";
	}
	
	
}
