package model;

public class University {
    private String name;
    private Faculty faculty;

    public University(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}

public class Faculty {
    private String name;
    private Department department;

    public Faculty(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

public class Department {
    private String name;
    private Group group;

    public Department(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }
}

public class Group {
    private String name;
    private Student student;

    public Group(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }
}

public class Student extends Human {
    public Student(String name, String surname, String patronymic, Sex sex) {
        super(name, surname, patronymic, sex);
    }
}

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sex getSex() {
        return sex;
    }
}

public enum Sex {
    MALE,
    FEMALE
}