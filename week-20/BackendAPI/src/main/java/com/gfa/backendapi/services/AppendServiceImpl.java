package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Append;
import org.springframework.stereotype.Service;

@Service
public class AppendServiceImpl implements AppendService {

    @Override
    public Append addA(String toAppend) {
        return new Append(toAppend + "a");
    }
}
