package com.sample.todo.service;

import java.util.List;

import com.sample.todo.vo.Todo;

public interface TodoService {
	List<Todo> getAllTodos();
	void addTodo(Todo todo);
	void deleteTodo(long no);
}
