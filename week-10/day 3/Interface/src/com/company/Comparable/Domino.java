package com.company.Comparable;


public class Domino implements Comparable <Domino> {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public int compareTo(Domino otherDomino){

        if(this.left == otherDomino.left){
            return Integer.compare(this.right,otherDomino.right);
        }
      return Integer.compare(this.left,otherDomino.left);
    }

}