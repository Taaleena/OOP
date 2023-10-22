package DZ5.Controller;

import DZ5.Model.Students;
import DZ5.Model.Group;
import DZ5.Model.Teacher;
import DZ5.Service.GroupService;
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
