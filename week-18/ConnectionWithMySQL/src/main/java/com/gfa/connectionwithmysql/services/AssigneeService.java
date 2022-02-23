package com.gfa.connectionwithmysql.services;

import com.gfa.connectionwithmysql.models.Assignee;

import java.util.List;

public interface AssigneeService{
    List<Assignee> getAllAssignees();

    void save(Assignee assignee);

    void removeAssignee(Long id);

}
