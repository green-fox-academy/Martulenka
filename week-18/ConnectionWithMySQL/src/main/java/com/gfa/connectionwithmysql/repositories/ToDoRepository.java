package com.gfa.connectionwithmysql.repositories;

import com.gfa.connectionwithmysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long>{

}
