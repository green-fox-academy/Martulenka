package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
    /*Create a map where the keys are strings and the values are strings with the following initial values

    Key	Value
        978-1-60309-452-8	A Letter to Jo
        978-1-60309-459-7	Lupus
        978-1-60309-444-3	Red Panda and Moon Bear
        978-1-60309-461-0	The Lab*/

        Map<String, String> libraryMap = new HashMap();

        libraryMap.put("978-1-60309-452-8","A Letter to Jo");
        libraryMap.put("978-1-60309-459-7","Lupus");
        libraryMap.put("978-1-60309-444-3","Red Panda and Moon Bear");
        libraryMap.put("978-1-60309-461-0","The Lab");

    /*Print all the key-value pairs in the following format
    A Letter to Jo (ISBN: 978-1-60309-452-8)
    Lupus (ISBN: 978-1-60309-459-7)
    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    The Lab (ISBN: 978-1-60309-461-0)*/

        libraryMap.entrySet().forEach(entry -> {
            System.out.println(entry.getValue() + "( ISBN: " + entry.getKey() + ")");
        });

    //Remove the key-value pair with key 978-1-60309-444-3
        libraryMap.remove("978-1-60309-444-3");

    //Remove the key-value pair with value The Lab
        libraryMap.entrySet().removeIf(entries->entries.getValue().equals("The Lab"));

    /*Add the following key-value pairs to the map
    Key	Value
        978-1-60309-450-4	They Called Us Enemy
        978-1-60309-453-5	Why Did We Trust Him?*/

        libraryMap.put("978-1-60309-450-4","They Called Us Enemy");
        libraryMap.put("978-1-60309-453-5","Why Did We Trust Him?");

    //Print whether there is an associated value with key 478-0-61159-424-8 or not

        if(libraryMap.containsKey("478-0-61159-424-8")){
            System.out.println("HashMap contains ISBN: 478-0-61159-424-8");
        }else{
            System.out.println("HashMap does not contain ISBN: 478-0-61159-424-8");
        }

    //Print the value associated with key 978-1-60309-453-5
        System.out.println("ISBN: 978-1-60309-453-5 => " + libraryMap.get("978-1-60309-453-5"));

    }
}
