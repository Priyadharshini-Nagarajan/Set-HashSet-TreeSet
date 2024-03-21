
import java.util.*;

class CourseRegistrationSystem {
    private Set<String> students;
    private Set<String> courses;
    private Map<String, Set<String>> studentCourses;

    public CourseRegistrationSystem() {
        students = new HashSet<>();
        courses = new HashSet<>();
        studentCourses = new HashMap<>();
    }

    public void addStudent(String student) {
        students.add(student);
        studentCourses.put(student, new HashSet<>());
        System.out.println("Student " + student + " added successfully.");
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course " + course + " added successfully.");
    }

    public void registerStudentForCourse(String student, String course) {
        if (students.contains(student) && courses.contains(course)) {
            studentCourses.get(student).add(course);
            System.out.println(student + " registered for course " + course + " successfully.");
        } else {
            System.out.println("Invalid student or course.");
        }
    }

    public void displayStudentCourses(String student) {
        if (students.contains(student)) {
            Set<String> courses = studentCourses.get(student);
            System.out.println(student + "'s registered courses: " + courses);
        } else {
            System.out.println("Student not found.");
        }
    }
}

public class HashSetJ {
    public static void main(String[] args) {
        CourseRegistrationSystem system = new CourseRegistrationSystem();

        system.addStudent("Pri");
        system.addStudent("Nila");
        system.addStudent("Sri");

        system.addCourse("Math");
        system.addCourse("Physics");
        system.addCourse("Biology");

        system.registerStudentForCourse("Pri", "Math");
        system.registerStudentForCourse("Nila", "Physics");
        system.registerStudentForCourse("Sri", "Math");
        system.registerStudentForCourse("Sri", "Biology");

        system.displayStudentCourses("Pri");
        system.displayStudentCourses("Nila");
        system.displayStudentCourses("Sri");
    }
}
    
