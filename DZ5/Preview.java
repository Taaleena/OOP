package DZ5;

import OOP.DZ5.Controller;
import OOP.DZ5.Students;
import OOP.DZ5.Teacher;

import java.util.List;

public class Preview {
    Controller controllerView = new Controller();

    public Preview(){
    }
    public void getTeacherID(Controller controllerView ,Teacher teacher){
        System.out.println("Teacher ID: " + controllerView.getTeacherID(teacher));
    }
    public void getStudentID(Controller controllerView , Students student){
        System.out.println("Student ID: " + controllerView.getStudentID(student));
    }
    public void getAllGroup( List<Students> studentList,Teacher teacher,Controller controllerView){
        System.out.println(controllerView.showGroup(teacher,studentList));
    }
}