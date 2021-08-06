package view;

import service.TodolistService;
import util.InputUtil;

public class TodolistView {

    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodolist(){
        while (true){
            todolistService.showTodolist();

            System.out.println(".:MENU:.");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");

            if (input.equals("1")){
                addTodolist();
            }else if(input.equals("2")){
                removeTodolist();
            }else if(input.equals("x")){
                break;
            }else{
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }

    public void addTodolist(){
        System.out.println("MENAMBAHKAN TODOLIST");

        var todo = InputUtil.input("Todo (x jika batal");
        if(todo.equals("x")){

        }else{
            todolistService.addTodolist(todo);
        }
    }

    public void removeTodolist(){
        System.out.println("MENGHAPUS TODOLIST");
        var todo = InputUtil.input("Nomer yang dihapus (x Jika Batal)");

        if(todo.equals("x")){

        }else {
            todolistService.removeTodolist(Integer.valueOf(todo));
        }
    }

}
