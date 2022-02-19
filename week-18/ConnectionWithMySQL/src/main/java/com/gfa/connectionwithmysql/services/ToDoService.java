package com.gfa.connectionwithmysql.services;

import com.gfa.connectionwithmysql.models.ToDo;

import java.util.List;

public interface ToDoService{

    List<ToDo> getAllToDos();

    void save();
}
