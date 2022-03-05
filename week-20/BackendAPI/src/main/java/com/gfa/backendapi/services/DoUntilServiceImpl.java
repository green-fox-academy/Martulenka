package com.gfa.backendapi.services;

import com.gfa.backendapi.models.DoUntil;
import com.gfa.backendapi.models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService{

    @Override
    public DoUntil getResult(Integer input, String operation){
        return new DoUntil(input,operation);
    }

    @Override
    public ErrorMessage getError() {
        return new ErrorMessage("Please provide a number!");

    }


}
