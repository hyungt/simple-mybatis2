package com.sample.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.todo.mappers.TodoMapper;
import com.sample.todo.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoMapper mapper;
	
	public List<Todo> getAllTodos() {
		return mapper.getAllTodos();
	}

	public void addTodo(Todo todo) {
		mapper.addTodo(todo);
	}

	public void deleteTodo(long no) {
		mapper.deleteTodo(no);
	}

}
