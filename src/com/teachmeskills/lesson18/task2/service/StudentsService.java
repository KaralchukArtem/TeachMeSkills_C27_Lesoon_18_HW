package com.teachmeskills.lesson18.task2.service;

import java.util.List;

public class StudentsService {
    public static void searchStudent(List<String> list) {
        list = list.stream()
                .filter(n -> n.toLowerCase().startsWith("а"))
                .toList();
        System.out.println("Все имена, начинающиеся на \"а|А\" -> " + list);
    }

    public static void sortedStudent(List<String> list) {
        list = list.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();
        System.out.println("Первый элемент коллекции -> " + list.get(0));
    }
}
