package domashki.OOP.DZ4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        GroupTeacher<Teacher> teachers = new GroupTeacher<>("teachers");
        teachers.add(new Historic("Larisa", "Alexandrova"));
        teachers.add(new Programm("Alexandr", "Vereshagin"));
        teachers.add(new Sport("Evgeniy", "Rykov"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }




    }
}