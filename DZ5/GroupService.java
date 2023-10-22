package DZ5;

import OOP.DZ5.Students;
import OOP.DZ5.Group;
import OOP.DZ5.Teacher;
import java.util.List;

public class GroupService extends Group {
    private Group studyGroup;
    List<Students> students;
    public GroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getID();
    }

    public Group createGroupService(Teacher teacher, List<Students> students) {
        studyGroup = new Group(teacher, students);
        return studyGroup;
    }
}