package com.company;

public class Student {
    String name;

    public Student(String name){
        this.name = name;
    }

    //learn() -> prints: the student is actually learning

    void learn(){
        System.out.println("the student is actually learning");
    }

    //question(teacher) -> calls the teacher's giveAnswer() method

    void question(Teacher teacher){
        teacher.giveAnswer();
    }
}
