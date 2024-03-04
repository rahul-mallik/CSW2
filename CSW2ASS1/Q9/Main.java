package CSW2ASS1.Q9;

import java.util.*;

class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Getters and setters
}

class Course {
    private String courseCode;
    private String title;
    private String description;
    private int maxEnrollment;

    public Course(String courseCode, String title, String description, int maxEnrollment) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.maxEnrollment = maxEnrollment;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    // Getters
}

interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails(Course course);
}

class Enrollment implements EnrollmentSystem {
    private Map<String, List<Student>> enrolledStudentsMap = new HashMap<>();

    @Override
    public void enrollStudent(Student student, Course course) {
        String courseCode = course.getCourseCode();
        enrolledStudentsMap.computeIfAbsent(courseCode, k -> new ArrayList<>()).add(student);
    }

    @Override
    public void dropStudent(Student student, Course course) {
        String courseCode = course.getCourseCode();
        enrolledStudentsMap.getOrDefault(courseCode, Collections.emptyList()).remove(student);
    }

    @Override
    public void displayEnrollmentDetails(Course course) {
        String courseCode = course.getCourseCode();
        List<Student> enrolledStudents = enrolledStudentsMap.getOrDefault(courseCode, Collections.emptyList());

        System.out.println("Enrollment details for course " + course.getTitle() + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        Course course1 = new Course("CSCI101", "Introduction to Programming", "Learn Java basics", 50);
        Course course2 = new Course("MATH201", "Calculus I", "Limits, derivatives, and integrals", 40);

        Enrollment enrollmentSystem = new Enrollment();
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);
        enrollmentSystem.enrollStudent(student1, course2);

        enrollmentSystem.displayEnrollmentDetails(course1);
        enrollmentSystem.displayEnrollmentDetails(course2);
    }
}
/*
    Output
        Enrollment details for course Introduction to Programming:
        Student ID: 101, Name: Alice
        Student ID: 102, Name: Bob
        Enrollment details for course Calculus I:
        Student ID: 101, Name: Alice

 */