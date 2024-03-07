package com.teachmeskills.lesson18.task2;

import com.teachmeskills.lesson18.task2.service.StudentsService;

import java.util.List;

import static com.teachmeskills.lesson18.task2.factory.StudentsFactory.createStudent;

public class Runner {
    public static void main(String[] args) {
        List<String> list = createStudent();
        StudentsService.searchStudent(list);
        StudentsService.sortedStudent(list);
    }
}
