package com.company.Printable;

public class Domino implements Printable{

    private int leftSide;
    private int rightSide;

    public Domino (int leftSide, int rightSide){
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + leftSide + " B side: " + rightSide);
    }

}
