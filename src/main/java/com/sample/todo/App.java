package com.sample.todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.todo.mappers.TodoMapper;
import com.sample.todo.service.TodoService;
import com.sample.todo.vo.Todo;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		TodoService service = context.getBean(TodoService.class);
		
		List<Todo> todos = service.getAllTodos();
		System.out.println(todos);
		
		/*Todo todo = new Todo();
		todo.setTitle("석화 바보");
		todo.setContents("석화 바보 만들기");
		todo.setDates("2017-10-16");
		service.addTodo(todo);
		
		
		System.out.println(todos);*/
		
		//service.deleteTodo(14);
		
		
	}
}
