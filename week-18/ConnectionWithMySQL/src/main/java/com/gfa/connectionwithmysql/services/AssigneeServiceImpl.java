package com.gfa.connectionwithmysql.services;

import com.gfa.connectionwithmysql.models.Assignee;
import com.gfa.connectionwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService{

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Assignee> getAllAssignees(){
        return (List<Assignee>) assigneeRepository.findAll();
    }

    @Override
    public void save(Assignee assignee){
        assigneeRepository.save(assignee);
    }

    @Override
    public void removeAssignee(Long id) {
        assigneeRepository.deleteById(id);
    }
}