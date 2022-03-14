package com.gfa.backendapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long logId;

    private LocalDateTime createdAt;
    private String endpoint;
    private String data;

    public Log (String endpoint,String data){
        this.endpoint = endpoint;
        this.data = data;
        this.createdAt = LocalDateTime.now();
    }
}