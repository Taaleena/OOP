package DZ5;

public class Students {
    private String name;

    public Students(String name, int studentsID) {
        this.name = name;
        this.studentsID = studentsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentsID;
    }

    @Override
    public String toString() {
        return " User: " +
                "Name = " + name +
                " Student ID: " + studentsID;  
    }
        
}

