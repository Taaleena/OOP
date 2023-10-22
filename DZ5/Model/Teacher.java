package DZ5.Model;


public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age, int teacherID) {
        this.name = name;
        this.age = age;
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return " User: " +
                "Name = " + name  +
                ",Teacher Id:" + teacherID +
                ", Age = " + age;
    }

    
}
