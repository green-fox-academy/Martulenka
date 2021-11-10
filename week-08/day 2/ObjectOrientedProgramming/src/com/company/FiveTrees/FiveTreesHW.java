package com.company.FiveTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveTreesHW {
    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();

        Tree birch = new Tree("deciduous","yellow",10,"monecious");
        Tree oak = new Tree("deciduous","orange",25,"monecious");
        Tree pine = new Tree("coniferous","green",15,"monecious");
        Tree maple = new Tree("deciduous","red",20,"polygamous");
        Tree willow = new Tree("deciduous","yellow",8,"dioecious");

        trees.add(birch);
        trees.add(oak);
        trees.add(pine);
        trees.add(maple);
        trees.add(willow);
    }
}
