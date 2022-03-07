package com.gfa.backendapi.services;

import com.gfa.backendapi.models.ErrorMessage;
import org.springframework.stereotype.Service;

import java.util.stream.LongStream;

@Service
public class DoUntilServiceImpl implements DoUntilService{

    @Override
    public long getSumUntil(Integer until) {
        long result =0;

        for (int i = 1; i <= until; i++) {
            result += i;
        }
        return result ;
    }

    @Override
    public long getFactor(Integer until) {
        return LongStream.rangeClosed(1, until)
                .reduce(1, (long x, long y) -> x * y);
    }

    @Override
    public ErrorMessage getError() {
        return new ErrorMessage("Please provide a number!");

    }


}
