package task2;

import java.util.Objects;

public class Student {

    String name;
    Integer year;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
