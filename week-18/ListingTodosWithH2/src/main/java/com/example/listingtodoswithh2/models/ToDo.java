package com.example.listingtodoswithh2.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ToDo {
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public ToDo(String title){
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

}
