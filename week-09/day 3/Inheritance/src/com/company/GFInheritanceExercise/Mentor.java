package com.company.GFInheritanceExercise;

public class Mentor extends Person {
    /*Create a Mentor class that has the same fields and methods as the Person class, and has the following additional

    fields:
    level: the level of the mentor (junior / intermediate / senior)
    methods:
    getGoal(): prints "Educate brilliant junior software developers."
    introduce(): prints "Hi, I'm name, a age year old gender level mentor."
    The Mentor class has the following constructors:

    Mentor(name, age, gender, level)
    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate*/

    String level;

    public Mentor(){
        super ("Jane Doe", 30, "female");
        this.level = "intermediate";
    };

    public Mentor (String name, int age, String gender, String level){
        super ("Jane Doe", 30, "female");
        this.level = level;
    }

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println( "Hi, I'm " + super.name + " , a " + super.age + " year old " +  super.gender + " " +  this.level + " mentor.");
    }

}
