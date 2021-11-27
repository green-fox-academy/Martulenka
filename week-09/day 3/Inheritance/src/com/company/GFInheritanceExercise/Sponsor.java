package com.company.GFInheritanceExercise;

public class Sponsor extends Person {
    /*Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional

    fields:
    company: name of the company
    hiredStudents: number of students hired
    method:
    introduce(): prints "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
    hire(): increases hiredStudents by 1
    getGoal(): prints "Hire brilliant junior software developers."
    The Sponsor class has the following constructors:

    Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
    Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0*/

    String company;
    int hiredStudents;

    public Sponsor(){
        super ("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    };

    public Sponsor (String name, int age, String gender, String company){
        super ("Jane Doe", 30, "female");
        this.company = company;
        this.hiredStudents = 0;
    }

    public void introduce(){
        System.out.println("Hi, I'm " + super.name + ", a " + super.age + " year old "+  super.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire(){
        this.hiredStudents ++;
    }
}
