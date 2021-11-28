package com.company.TheGardenApplication;

public class Main {
    public static void main(String[] args) {

        Garden secretGarden = new Garden("SecretGarden");

        secretGarden.addFlower(new Flower("yellow"));
        secretGarden.addFlower(new Flower("blue"));
        secretGarden.addTree(new Tree("purple"));
        secretGarden.addTree(new Tree("orange"));

        secretGarden.info();

        secretGarden.waterGarden(40);

        secretGarden.waterGarden(70);

    }
}
