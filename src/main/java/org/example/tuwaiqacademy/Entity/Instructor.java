package org.example.tuwaiqacademy.Entity;

import java.util.ArrayList;

public class Instructor {
    private String instructor_name;
    private String email;
    private String bootcamp_name;

    public Instructor(String instructor_name, String email) {
        this.instructor_name = instructor_name;
        this.email = email;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBootcamp_name() {
        return bootcamp_name;
    }

    public void setBootcamp_name(String bootcamp_name) {
        this.bootcamp_name = bootcamp_name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructor_name='" + instructor_name + '\'' +
                ", email='" + email + '\'' +
                ", bootcamp_name='" + bootcamp_name + '\'' +
                '}';
    }
}
