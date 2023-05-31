package controller;

import model.*;

public class UniversityController {
    public static University createTypicalUniversity() {
        Student student = new Student("John", "Doe", "Smith", Sex.MALE);
        Group group = new Group("Group 1", student);
        Department department = new Department("Computer Science", group);
        Faculty faculty = new Faculty("Engineering", department);
        University university = new University("Example University", faculty);
        return university;
    }
}
