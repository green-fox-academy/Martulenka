package com.company.Apples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

class AppleTest {

    @Test
    void getApple(){
        Apple a = new Apple(Color.red);
        assertEquals("apple",a.getApple());
    }

}