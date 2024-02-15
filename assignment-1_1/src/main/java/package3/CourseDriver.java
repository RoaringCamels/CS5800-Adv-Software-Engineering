package main.java.package3;

public class CourseDriver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Yu", "Sun", "8-1423");

        Textbook textbook1 = new Textbook("Engineering for Dummies", "G4G", "Webster");
        Textbook textbook2 = new Textbook("Computers for Dummies", "Intel", "Apple");

        Course course1 = new Course("Advanced Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Advanced Computers", instructor2, textbook2);

        System.out.println("---------------------");
        course1.print();
        System.out.println("---------------------");
        course2.print();
    }
}
