package com.gfa.connectionwithmysql.services;

import com.gfa.connectionwithmysql.models.ToDo;
import com.gfa.connectionwithmysql.repositories.ToDoRepository;
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

    @Override
    public void save(ToDo toDo){
        toDoRepository.save(toDo);
    }

    @Override
    public void removeToDo(Long id) {
        toDoRepository.deleteById(id);
    }

}
