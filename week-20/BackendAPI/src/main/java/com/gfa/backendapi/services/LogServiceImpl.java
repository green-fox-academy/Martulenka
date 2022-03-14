package com.gfa.backendapi.services;

import com.gfa.backendapi.Repositories.LogRepository;
import com.gfa.backendapi.models.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    private LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public List<Log> getAllLogs(){
        return logRepository.findAll();
    }

    @Override
    public void save(Log log){
        logRepository.save(log);
    }

    @Override
    public long getCount(){
        return logRepository.count();
    }

}
