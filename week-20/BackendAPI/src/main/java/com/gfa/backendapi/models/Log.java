package com.gfa.backendapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Log {

    private LocalDateTime createdAt;
    private String endpoint;
    private String data;
}
