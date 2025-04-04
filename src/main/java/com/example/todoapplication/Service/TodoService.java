package com.example.todoapplication.Service;

import java.util.List;

import model.Todo;

public interface TodoService {
	public String createTodoTasl(Todo totask);
	public String updateTodoTask(Todo totask);
	public String deleteTodoTask(String totaskId);
	public Todo getTodoTask(String totaskId);
	public List<Todo> getAllTodoTasks();
	
	
}
