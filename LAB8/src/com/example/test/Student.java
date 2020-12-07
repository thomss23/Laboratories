package com.example.test;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private long id;
    private double averageGrade;

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.averageGrade > o.averageGrade)
            return 1;
        else if(this.averageGrade<o.averageGrade)
            return -1;
        else if(this.averageGrade == o.averageGrade) {
            if (this.name.compareTo(o.name) > 0) {
                return 1;
            } else if (this.name.compareTo(o.name) < 0) {
                return -1;
            } else if (this.name.compareTo(o.name) == 0) {
                if (this.surname.compareTo(o.surname) > 0) {
                    return 1;
                } else if (this.surname.compareTo(o.surname) < 0) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "\n" + "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }
}
