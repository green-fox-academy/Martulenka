package com.gfa.backendapi.services;

import com.gfa.backendapi.models.DoUntil;
import com.gfa.backendapi.models.ErrorMessage;

public interface DoUntilService {
    DoUntil getResult(Integer input, String operation);

    ErrorMessage getError();
}
