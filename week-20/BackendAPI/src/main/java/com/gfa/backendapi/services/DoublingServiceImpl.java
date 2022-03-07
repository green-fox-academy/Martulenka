package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Doubling;
import com.gfa.backendapi.models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class DoublingServiceImpl implements DoublingService {

    @Override
    public Doubling addDoubling(int input) {
        return new Doubling(input, input*2);
    }

    @Override
    public ErrorMessage getError() {
        return new ErrorMessage("Please provide an input!");
    }
}
