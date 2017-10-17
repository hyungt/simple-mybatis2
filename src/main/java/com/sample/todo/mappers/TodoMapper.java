package com.sample.todo.mappers;

import java.util.List;

import com.sample.todo.vo.Todo;

public interface TodoMapper {

	List<Todo> getAllTodos();
	void addTodo(Todo todo);
	void deleteTodo(long no);
	
}
