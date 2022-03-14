package com.gfa.backendapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogSet {

    private List<Log> entries;
    private long entry_count;

    public LogSet(List<Log> entries) {
        this.entries = entries;
        this.entry_count = entries.size();
    }

}
