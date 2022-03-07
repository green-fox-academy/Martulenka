package com.gfa.backendapi.services;

import com.gfa.backendapi.models.ErrorMessage;
import com.gfa.backendapi.models.Greeter;

public interface GreeterService {

    Greeter addGreeter(String name, String title);
    ErrorMessage getError(String name, String title);
}
