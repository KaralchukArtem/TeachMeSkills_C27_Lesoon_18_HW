package com.teachmeskills.lesson18.task2.factory;

import java.util.ArrayList;
import java.util.List;

public class StudentsFactory {
    public static List<String> createStudent() {
        List<String> list = new ArrayList<>(List.of(
                "Артём",
                "Алина",
                "Анастасия",
                "артём",
                "Никита",
                "Олег",
                "Иван",
                "Кирилл",
                "Руслан",
                "Евгений",
                "Павел",
                "Руслан",
                "Руслан",
                "Александр",
                "Даниил",
                "алексей",
                "Владислав"));
        System.out.println("Factory -> " + list);
        return list;
    }
}
