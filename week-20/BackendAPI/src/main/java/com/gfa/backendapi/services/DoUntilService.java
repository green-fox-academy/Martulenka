package com.gfa.backendapi.services;

import com.gfa.backendapi.models.ErrorMessage;

public interface DoUntilService {

    long getSumUntil(Integer until);

    long getFactor(Integer until);

    ErrorMessage getError();
}
