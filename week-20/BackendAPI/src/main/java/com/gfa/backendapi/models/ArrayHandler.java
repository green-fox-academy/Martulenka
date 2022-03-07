package com.gfa.backendapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ArrayHandler {

    private String what;
    private List<Integer> numbers;
}
