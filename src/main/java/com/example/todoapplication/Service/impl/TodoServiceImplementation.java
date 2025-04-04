package com.example.todoapplication.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.example.todoapplication.Repository.todoAppRepository;
import com.example.todoapplication.Service.TodoService;

import model.Todo;


//this annotation is must to identify as service
@Service
@EnableJpaRepositories
public class TodoServiceImplementation implements TodoService{
	
	private final todoAppRepository taskRepository;
	
	@Autowired
	public TodoServiceImplementation(todoAppRepository taskRepository) {
		//super();
		this.taskRepository = taskRepository;
	}
	
	
	@Override
	public String createTodoTasl(Todo totask) {
		//can add more business logic
		taskRepository.save(totask);
		return "Success";
		
		
	}

	@Override
	public String updateTodoTask(Todo totask) {
		//can add more business logic
		taskRepository.save(totask);
		
		return "Successfully updated";
	}

	@Override
	public String deleteTodoTask(String totaskId) {
		//can add more business logic
		taskRepository.deleteById(totaskId); //this is very sensitive operation 
		return null;
	}

	@Override
	public Todo getTodoTask(String totaskId) {
		//can add more business logic
		return taskRepository.findById(totaskId).get();
		
	
	}

	@Override
	public List<Todo> getAllTodoTasks() {
		//can add more business logic
		return taskRepository.findAll();
		
	}
	

}
