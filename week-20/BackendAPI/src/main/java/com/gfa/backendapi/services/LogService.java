package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Log;

import java.util.List;

public interface LogService {

    List<Log> getAllLogs();

    void save(Log log);

    long getCount();
}
