package org.example.tuwaiqacademy.Entity;

import java.util.ArrayList;

public class Bootcamp {
    private String bootcamp_name;
    private int bootcamp_evaluation;
    private Instructor instructor;
    private ArrayList<Students> students;

    public Bootcamp(String bootcamp_name, int bootcamp_evaluation, Instructor instructor, ArrayList<Students> students) {
        this.bootcamp_name = bootcamp_name;
        this.bootcamp_evaluation = bootcamp_evaluation;
        this.instructor = instructor;
        setStudents(students);
    }

    public String getBootcamp_name() {
        return bootcamp_name;
    }

    public void setBootcamp_name(String bootcamp_name) {
        this.bootcamp_name = bootcamp_name;
    }

    public int getBootcamp_evaluation() {
        return bootcamp_evaluation;
    }

    public void setBootcamp_evaluation(int bootcamp_evaluation) {
        this.bootcamp_evaluation = bootcamp_evaluation;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        for(Students student:students){
            student.registerBootCamp(bootcamp_name);
        }
        this.students = students;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "bootcamp_name='" + bootcamp_name + '\'' +
                ", bootcamp_evaluation=" + bootcamp_evaluation +
                ", instructor=" + instructor +
                '}';
    }
}
