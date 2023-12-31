package DZ5;

import DZ5.Controller.Controller;
import DZ5.Model.Students;
import DZ5.Model.Group;
import DZ5.Model.Teacher;
import DZ5.View.Preview;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Teacher teacherDmitriy = new Teacher(" Dmitriy ", " Varshavskiy ", 38, 13);

        Students studentNikolay = new Student("Nikolay", "Veter", 22, 21);
        Students studentViktor = new Student("Viktor", "Nemchinov", 21, 22);
        Students studentIrina = new Student("Irina", "Letova", 22, 23);
        Students studentSergey = new Student("Sergey", "Netishin", 23, 24);
        

        List<Students> studentList = new ArrayList<>();
        studentList.add(studentNikolay);
        studentList.add(studentViktor);
        studentList.add(studentIrina);
        studentList.add(studentSergey);


        Controller controller = new Controller();


        Preview preview = new Preview();
        preview.getTeacherID(controller,teacherDmitriy);
        preview.getStudentID(controller,studentNikolay);

        preview.getAllGroup(studentList,teacherDmitriy,controller);
    }

}