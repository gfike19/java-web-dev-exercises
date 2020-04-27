package exercises;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            Student s = new Student();
            studentList.add(s);
        }

        Course c = new Course ("programming", studentList, 1);

        ArrayList<Student> newStudents = c.getStudentList();

        String newName = "php";
        c.setName(newName);
    }
}
