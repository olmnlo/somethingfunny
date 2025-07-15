package org.example.tuwaiqacademy.Entity;

public class Students {
    private String student_name;
    private String student_email;
    private String student_age;

    public Students(String student_name, String student_email, String student_age) {
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_age = student_age;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_age() {
        return student_age;
    }

    public void setStudent_age(String student_age) {
        this.student_age = student_age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "student_name='" + student_name + '\'' +
                ", student_email='" + student_email + '\'' +
                ", student_age='" + student_age + '\'' +
                '}';
    }
}
