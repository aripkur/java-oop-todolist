package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistRepository.data[0] = new Todolist("lalaal");
        todolistRepository.data[1] = new Todolist("lalaal");
        todolistRepository.data[2] = new Todolist("lalaal");

        todolistService.showTodolist();
    }

    public  static void testAddTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("satu");
        todolistService.addTodolist("satu2");
        todolistService.addTodolist("satu3");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("satu");
        todolistService.addTodolist("satu2");
        todolistService.addTodolist("satu3");

        todolistService.showTodolist();

        todolistService.removeTodolist(2);
        todolistService.showTodolist();

    }
}
