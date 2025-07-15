package org.example.tuwaiqacademy.Entity;

import java.util.ArrayList;

public class Tuwaiq {
    private ArrayList<Instructor> instructors;
    private ArrayList<Students> students;
    private ArrayList<Bootcamp> bootcamps;

    public Tuwaiq(ArrayList<Instructor> instructors, ArrayList<Students> students, ArrayList<Bootcamp> bootcamps) {
        this.instructors = instructors;
        this.students = students;
        this.bootcamps = bootcamps;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public ArrayList<Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public void setBootcamps(ArrayList<Bootcamp> bootcamps) {
        this.bootcamps = bootcamps;
    }

    public void addInstructor(Instructor instructor){
        this.instructors.add(instructor);
    }
    public void addStudents(Students students){
        this.students.add(students);
    }
    public void addBootcamp(Bootcamp bootcamp){
        this.bootcamps.add(bootcamp);
    }
    public ArrayList<Instructor> displayInstructors(){
        return instructors;
    }
    public ArrayList<Students> displayStudents(){
        return students;
    }
    public ArrayList<Bootcamp> displayBootcamps(){
        return bootcamps;
    }

    public void assignInstructor(Instructor instructor, Bootcamp bootcamp){
        bootcamp.setInstructor(instructor);
    }

    @Override
    public String toString() {
        return "Tuwaiq{" +
                "instructors=" + instructors +
                ", students=" + students +
                ", bootcamps=" + bootcamps +
                '}';
    }
}
