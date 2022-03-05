package com.gfa.backendapi.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.stream.LongStream;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoUntil {
    private int received;
    private long result;

    public DoUntil(int received, String operation) {
        this.received = received;

        if(operation == "sum"){
            this.result = getSumUntil(received);
        }else{
            this.result = getFactor(received);
        }
    }

    public long getSumUntil(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x + y);
    }

    public long getFactor(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

}
