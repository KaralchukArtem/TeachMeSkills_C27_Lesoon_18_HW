package com.teachmeskills.lesson18.task1.factory;

import java.util.ArrayList;
import java.util.List;

public class CreateListFactory {
    public static List<Integer> creatList() {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            int i = (int) (1 + Math.random() * 21);
            list.add(i);
        }
        System.out.println("Original List -> \n" + list);
        return list;
    }
}
