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

    public ArrayList<Bootcamp> getTopBootcamps(){
        ArrayList<Bootcamp> bootcamps = new ArrayList<>();
        for(Bootcamp b: this.bootcamps){
            if(b.getBootcamp_evaluation() > 4){
                bootcamps.add(b);
            }
        }
        return bootcamps;
    }

    public ArrayList<Students> getStudentsCybersecurity(){
        ArrayList<Students> cybersecurity = new ArrayList<>();
        for(Students s: students){
            if(s.getBootcamp().equals("Cybersecurity Essentials")){
                cybersecurity.add(s);
            }
        }
        return cybersecurity;
        }

    public ArrayList<Students> getStudentsDevOpsAndCloud(){
        ArrayList<Students> devOps = new ArrayList<>();
        for(Students s: students){
            if(s.getBootcamp().equals("DevOps and Cloud")){
                devOps.add(s);
            }
        }
        return devOps;
    }

    public ArrayList<Students> getStudentsMobileAppDevelopment(){
        ArrayList<Students> mobileAppDevelopment = new ArrayList<>();
        for(Students s: students){
            if(s.getBootcamp().equals("Mobile App Development")){
                mobileAppDevelopment.add(s);
            }
        }
        return mobileAppDevelopment;
    }

    public ArrayList<Students> getStudentsPython(){
        ArrayList<Students> python = new ArrayList<>();
        for(Students s: students){
            if(s.getBootcamp().equals("Python for Data Science")){
                python.add(s);
            }
        }
        return python;
    }

    public ArrayList<Students> getStudentsFrontend(){
        ArrayList<Students> frontend = new ArrayList<>();
        for(Students s: students){
            if(s.getBootcamp().equals("Frontend Development")){
                frontend.add(s);
            }
        }
        return frontend;
    }

    public ArrayList<Students> getStudentsSpringboot(){
        ArrayList<Students> java = new ArrayList<>();
        for(Students s: students){
            if(s.getBootcamp().equals("Java Spring Boot")){
                java.add(s);
            }
        }
        return java;
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
