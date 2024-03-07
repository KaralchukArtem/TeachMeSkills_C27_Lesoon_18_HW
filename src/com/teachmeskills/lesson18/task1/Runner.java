package com.teachmeskills.lesson18.task1;

import com.teachmeskills.lesson18.task1.service.ListService;

import java.util.List;

import static com.teachmeskills.lesson18.task1.factory.CreateListFactory.creatList;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = creatList();
        ListService.removeDuplicates(list);
        ListService.allEvenElements(list);
        ListService.elementMultiplied(list);
        ListService.sortFirstElements(list);
        ListService.sizeStream(list);
        ListService.averageSum(list);
    }
}
