package com.company;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        /*We are going to represent our contacts in a map where both the keys and values are strings.
        Create a map with the following key-value pairs:
        Name (key)	Phone number (value)
        William A. Lathan	405-709-1865
        John K. Miller	402-247-8568
        Hortensia E. Foster	606-481-6467
        Amanda D. Newland	319-243-5613
        Brooke P. Askew	307-687-2982*/

        HashMap<String, String> phoneBook = new HashMap<String, String>();

        phoneBook.put("William A. Lathan","405-709-1865");
        phoneBook.put("John K. Miller","402-247-8568");
        phoneBook.put("Hortensia E. Foster","606-481-6467");
        phoneBook.put("Amanda D. Newland","319-243-5613");
        phoneBook.put("Brooke P. Askew","307-687-2982");

        /*Create an application which prints out the answers to the following questions:
        What is John K. Miller's phone number?
        Whose phone number is 307-687-2982?
        Do we know Chris E. Myers' phone number?*/

        System.out.println("What is John K. Miller's phone number? " + phoneBook.get("John K. Miller"));

        String name = "Not in phone book";

        if (phoneBook.containsValue("307-687-2982")) {
            for (Map.Entry bookEntry : phoneBook.entrySet())
                if (bookEntry.getValue() == "307-687-2982") {
                    name = bookEntry.getKey().toString();
                    break;
                }
        }

        System.out.println("Whose phone number is 307-687-2982? " + name);
        System.out.println("Do we know Chris E. Myers' phone number? " + checkIfContainsKey("Chris E. Myers",phoneBook));
    }

    public static String checkIfContainsKey(String name, HashMap phoneBook) {
        String containsKey;

        if(phoneBook.containsKey(name)){
            containsKey = "Yes";
        }else{
            containsKey = "No";
        }

        return containsKey;
    }
}
