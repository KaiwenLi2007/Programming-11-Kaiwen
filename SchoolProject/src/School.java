import java.util.ArrayList;

public class School {
    //give fields and create the arraylist for teacher and student
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String name;
    private String location;
    private int yearsold;

    //constructor
    public School(String name, String location, int yearFounded) {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.name = name;
        this.location = location;
        this.yearsold = yearsold;

    }
    //Methods
    //Add a teacher to list
    public void addt(Teacher a) {
        teachers.add(a);
    }
    //Remove a teacher to list
    public void removet(Teacher a) {
        teachers.remove(a);
    }
    //Add a student to list
    public void adds(Student a) {
        students.add(a);
    }
    //delete a teacher to list
    public void removes(Student a) {
        students.remove(a);
    }
    //print out all teachers
    public void printteacher() {
        for (Teacher a : teachers) {
            System.out.println(a);
        }
    }
    //print out all students
    public void printstudent() {
        for (Student a : students) {
            System.out.println(a);
        }
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYearsold() {
        return yearsold;
    }

    public void setYearsold(int yearsold) {
        this.yearsold = yearsold;
    }

}
