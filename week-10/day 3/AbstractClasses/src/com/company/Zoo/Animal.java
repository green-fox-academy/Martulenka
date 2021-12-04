package com.company.Zoo;

public abstract class Animal {
    /*it has name, age field
    it has getName() and breed() methods
    Have we got all fields and methods we should? What about gender? Any other? Write down at least 3 fields and/or methods that should be included in Animal.
    */

    private String name;
    private int age;
    private String gender;

    public Animal (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public String getName(){
        return this.name;
    }

    public abstract String breed();

}
