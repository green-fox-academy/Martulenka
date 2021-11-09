package com.company;

public class PostIt {
    /*Post-it
    Create a PostIt class that has
        a backgroundColor represented by a string
        a text on it
        a textColor represented by a string
    Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/

    String postItBackground;
    String postItText;
    String postItTextColor;

    public static void main(String[] args) {

        PostIt note1 = new PostIt();
        note1.postItBackground = "orange";
        note1.postItText = "Idea 1";
        note1.postItTextColor = "blue";

        PostIt note2 = new PostIt();
        note2.postItBackground = "pink";
        note2.postItText = "Awesome";
        note2.postItTextColor = "black";

        PostIt note3 = new PostIt();
        note3.postItBackground = "yellow";
        note3.postItText = "Superb!";
        note3.postItTextColor = "green";

    }

}
