package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World!" to the terminal window
        System.out.println("Hello, World!");

        //hover over method, ctrl + click = help on the method
        //right click on variable - refactor = change variable name in your whole code

        /*Naming convention
        camel case
        classes start with capital letter
         */

        /*Variables
        Numbers
        Integer
        int
        byte
        short
        long
        Long
        */

        int number = 15;
        System.out.println(number);

        number = 100;
        System.out.println(number);

        //Mathematical Operators
        //+ - / * %

        int number2 = 7;
        System.out.println(number % 7);
        System.out.println(number / 7);

        Integer num = null;
        int num2 = 0; //int cannot store null (=nothing) int is a primitive data type while Integer is a Wrapper class. ... Since Integer is a wrapper class for int data type, it gives us more flexibility in storing, converting and manipulating an int data. Integer is a class and thus it can call various in-built methods defined in the class

        System.out.println(num);
        System.out.println(num2);

        Long numLong = 3000000000000l;
        System.out.println(numLong);

        float floatNo = 14.6123f; //needs to have f at the end

        double doubleNo = 14.6123;

        /*
        Text
        String
        char
        Character
        */

        String sentence = "This is a sen\"te\"nce.";
        String sentence2 = "This is a sen" + "\"te\"" + "nce.";
        System.out.println(sentence);
        System.out.println(sentence2);

        String superSentence = sentence + " " + sentence2;
        String superSentence2 = sentence.concat(sentence2);

        System.out.println(superSentence);
        System.out.println(superSentence2);

        char c = 'c';
        System.out.println(superSentence+c);

        /*
        Boolean/boolean
         */

        Boolean isJavaDifficult = false;

        //Boolean operators
        //< > >= <= == !=
        //&& ||

        int a = 20;
        int b = 15;

        boolean isHigher = a > b;

        System.out.println(isHigher);

        String myName = "Martina";

        if (a > b && myName.contains("tina")) {
            System.out.println("A was bigger!");
        }else if (a == b){
            System.out.println("A was just as big as B!");
        }else {
            System.out.println("B was bigger.");
        }

        //i++ ++i i+=1 i=i+1
        /*
        for (int i = 0; i < 100; i++){
            System.out.println("Value of i: " + i);
        }
        */

        char[] nameAsArray = myName.toCharArray();

        for(char myChar : myName.toCharArray()){
            System.out.println(myChar);
        }

        int i = 0;

        while (i < 100){
            System.out.println("the while condition was true");
            i += 25;
        }

    i = 0;

    do {
        System.out.println("the while condition was true");
        i += 25;

    }while(i < 100);

    Scanner scanner = new Scanner(System.in); //creating new scanner object
/*
    System.out.println("Please gimme your name: ");
    String name = scanner.next();
    System.out.println("Please provide your age: ");
    int age = scanner.nextInt();

    System.out.println("Hello " + name + " . You are " + age + " old.");
*/

    //switch is similar to if statement. If if has more than 4 branches, it is more efficient to use switch

        Calendar calendar = GregorianCalendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    switch(dayOfWeek){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("none of the above");
    }


    }
}
