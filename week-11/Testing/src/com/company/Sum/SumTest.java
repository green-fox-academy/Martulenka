package com.company.Sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void getSum(){
        Sum s = new Sum();

        s.addValue(1);
        s.addValue(2);
        s.addValue(3);
        
        assertEquals(6,s.getSum());
    }

}