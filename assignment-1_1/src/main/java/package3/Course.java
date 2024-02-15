package main.java.package3;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook){
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {return courseName;}
    public Instructor getInstructor() {return instructor;}
    public Textbook getTextbook() {return textbook;}

    public void setCourseName(String courseName) {this.courseName = courseName;}
    public void setInstructor(Instructor instructor) {this.instructor = instructor;}
    public void setTextbook(Textbook textbook) {this.textbook = textbook;}

    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                ", Office Number: " + instructor.getOfficeNum());
        System.out.println("Textbook: " + textbook.getTitle() + System.lineSeparator() + 
        "Written by: " + textbook.getAuthor() + System.lineSeparator() + 
        "Publisher: " + textbook.getPublisher());
    }
}
