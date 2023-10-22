package DZ5.Service;

import DZ5.Model.Group;
import DZ5.Model.Teacher;
import java.util.List;

public class GroupService extends Group {
    private Group Group;
    List<Students> students;
    public GroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getID();
    }

    public Group createGroupService(Teacher teacher, List<Students> students) {
        Group = new Group(teacher, students);
        return Group;
    }
}