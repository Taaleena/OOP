package DZ4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupTeacher<Teacher> teachers = new GroupTeacher<>("teachers");
        teachers.add(new Historic("Larisa", "Alexandrova", "32"));
        teachers.add(new Programm("Alexandr", "Vereshagin", "40"));
        teachers.add(new Sport("Evgeniy", "Rykov", "51"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }




    }
}