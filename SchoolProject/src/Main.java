public class Main {
    public static void main(String[] args) {
        //create a school
        School school = new School("Lord Byng", "Vancouver", 98);
        //create 3 teachers
        school.addt(new Teacher("Jason", "Yee", "Math"));
        school.addt(new Teacher("Jane", "Doe", "Science"));
        school.addt(new Teacher("Michael", "Rezler", "English"));
        //create 10 students
        school.adds(new Student("Garrison", "Qu", 12));
        school.adds(new Student("Bob", "Zheng", 11));
        school.adds(new Student("Emily", "Liu", 11));
        school.adds(new Student("James", "Wang", 11));
        school.adds(new Student("Olivia", "Wu", 12));
        school.adds(new Student("William", "He", 12));
        school.adds(new Student("Sophia", "Song", 11));
        school.adds(new Student("Josh", "Rodd", 11));
        school.adds(new Student("Bob", "Wang", 9));
        school.adds(new Student("Howard", "Zhu", 12));
        //print out the list of teachers and students
        System.out.println("Teachers:");
        school.printteacher();
        System.out.println("Students:");
        school.printstudent();
        //remove the first and second students and the first teacher
        school.removes(school.students.get(0));
        school.removes(school.students.get(0));
        school.removet(school.teachers.get(0));
        //print out the list of teachers and students
        System.out.println("After removals:");
        System.out.println("Teachers:");
        school.printteacher();
        System.out.println("Students:");
        school.printstudent();
    }
}
