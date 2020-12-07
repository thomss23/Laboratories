package task2;

import java.util.ArrayList;

public class Course {
    String title;
    String description;
    ArrayList<Student> students = new ArrayList<Student>();

    public ArrayList<Student> filterYear(ArrayList<Student> students,int year){
        ArrayList<Student> result = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            if(students.get(i).getYear()==year){
                result.add(students.get(i));
            }
        }
        return result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
