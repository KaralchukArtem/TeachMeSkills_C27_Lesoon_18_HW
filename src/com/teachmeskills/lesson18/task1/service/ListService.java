package com.teachmeskills.lesson18.task1.service;

import java.util.List;

public class ListService {

    public static void removeDuplicates(List<Integer> list) {
        list = list.stream()
                .distinct()
                .toList();
        System.out.println("List - removeDuplicates\n" + list);
    }

    public static void allEvenElements(List<Integer> list) {
        list = list.stream()
                .filter(n -> n >= 7 & n <= 17 & n % 2 == 0)
                .toList();
        System.out.println("List - allEvenElements\n" + list);
    }

    public static void elementMultiplied(List<Integer> list) {
        list = list.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("List - elementMultiplied\n" + list);
    }

    public static void sortFirstElements(List<Integer> list) {
        list = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println("List - sortFirstElements\n" + list);
    }

    public static void sizeStream(List<Integer> list) {
        System.out.println("List - sizeStream -> " + (long) list.size());
    }

    public static void averageSum(List<Integer> list) {
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        System.out.println("Average -> " + average);
    }
}
