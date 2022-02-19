package com.example.listingtodoswithh2.services;

import com.example.listingtodoswithh2.models.ToDo;
import com.example.listingtodoswithh2.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl  implements ToDoService{

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public List<ToDo> getAllToDos(){
        return (List<ToDo>) toDoRepository.findAll();
    }
}
