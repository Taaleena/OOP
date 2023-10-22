package DZ5.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Group {
    Teacher teacher;
    List<Students> listOfStudent;
    public Group() {
    }
    public Group(Teacher teacher, List<Students> students) {
        this.teacher = teacher;
        this.listOfStudent = students;
    }

    public int getTeacherID(Teacher teacher) {
        return teacher.teacherID;
    }

    public int getStudentID(Students student){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return "StudyGroup: "
                + teacher +
                "Students:"+ "\n" + listOfStudent;
    }
}