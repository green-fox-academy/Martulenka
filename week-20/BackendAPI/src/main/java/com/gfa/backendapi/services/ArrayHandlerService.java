package com.gfa.backendapi.services;

import com.gfa.backendapi.models.ArrayHandler;
import com.gfa.backendapi.models.ErrorMessage;

import java.util.List;

public interface ArrayHandlerService {

    List<Integer> getResultList(ArrayHandler arrayHandler);

    Integer getResultInteger(ArrayHandler arrayHandler);

    ErrorMessage getError(String what, List<Integer> numbers);

}
