public class Student {
    //fields
    private String firstName;
    private String lastName;
    private int grade;
    private int studentnum;
    static int counter = 1;//student number generators
    //constructor
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentnum = counter;
        counter++;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(int studentnum) {
        this.studentnum = studentnum;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentnum;
    }
}
