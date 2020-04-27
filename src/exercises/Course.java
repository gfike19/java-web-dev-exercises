package exercises;

import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Student> studentList;
    private int id;

    public Course (String name, ArrayList<Student> studentLIst, int id){
        this.setName(name);
        this.setStudentList(getStudentList());
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
