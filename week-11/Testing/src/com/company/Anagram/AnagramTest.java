package com.company.Anagram;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram(){
        Anagram a = new Anagram("Tom Marvolo Riddle","I am Lord Voldemort");
        assertEquals(true, a.isAnagram());
    }

    @Test
    void isNotAnagram(){
        Anagram a = new Anagram("Test","apple");
        assertEquals(false, a.isAnagram());
    }

}