package com.company;

public class Teacher {
    String name;

    public Teacher(String name){
        this.name = name;
    }

    //teach(student) -> calls the student's learn() method

    void teach(Student student){
        student.learn();
    }

    //giveAnswer() -> prints: the teacher is answering a question

    void giveAnswer(){
        System.out.println("the teacher is answering a question");
    }
}
