package com.example.listingtodoswithh2.repositories;

import com.example.listingtodoswithh2.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long>{


}
