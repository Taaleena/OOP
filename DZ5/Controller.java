package DZ5;

import OOP.DZ5.Students;
import OOP.DZ5.StudyGroup;
import OOP.DZ5.Teacher;
import OOP.DZ5.GroupService;
import java.util.List;

public class Controller extends GroupService {

    GroupService GroupService;
    Group Group = new Group();
    public Controller() {
        super();
        this.GroupService = new GroupService();
    }


    public Group showGroup(Teacher teacher, List<Students> listOfStudents) {
        if (teacher != null && listOfStudents != null) {
            Group = GroupService.createGroupService(teacher, listOfStudents);
        } else {
            System.out.println("Impossible to create group!");
        }
        return Group;
    }
}
