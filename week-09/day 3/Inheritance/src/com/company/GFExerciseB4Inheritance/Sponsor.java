package com.company.GFExerciseB4Inheritance;

public class Sponsor {
    /*Create a Sponsor class that has the same fields and methods as the Personclass, and has the following additional

            fields:
    company: name of the company
    hiredStudents: number of students hired
    method:
    introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
    hire(): increase hiredStudents by 1
    getGoal(): prints out "Hire brilliant junior software developers."
    The Sponsor class has the following constructors:

    Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
    Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0*/

    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    public Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    };

    public Sponsor (String name, int age, String gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    public void introduce(){
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old "+  this.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire(){
        this.hiredStudents ++;
    }
}
