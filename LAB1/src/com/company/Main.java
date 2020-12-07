package com.company;


import task2.Course;
import task2.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Course course = new Course();
        course.setTitle("Poli");
        course.setDescription("OOP");

        Student tom = new Student();
        tom.setName("Tom");
        tom.setYear(2014);
        course.getStudents().add(tom);

        Student vik = new Student();
        vik.setName("Vik");
        vik.setYear(2014);
        course.getStudents().add(vik);

        Student gutnic = new Student();
        gutnic.setName("Gutnic");
        gutnic.setYear(2013);
        course.getStudents().add(gutnic);

        ArrayList<Student> result = new ArrayList<>();

        result = course.filterYear(course.getStudents(),2014);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i).toString());
        }

        Student gutnic2 = new Student();
        gutnic2.setName("Gutnic");
        gutnic2.setYear(2013);

        System.out.println(gutnic.equals(gutnic2));











    }

}
