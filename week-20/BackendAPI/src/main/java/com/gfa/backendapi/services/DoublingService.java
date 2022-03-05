package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Doubling;
import com.gfa.backendapi.models.ErrorMessage;

public interface DoublingService {

    Doubling getDoubling(int input);
    ErrorMessage getError();
}