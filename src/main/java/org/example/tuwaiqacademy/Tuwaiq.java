package org.example.tuwaiqacademy;

import java.util.ArrayList;

public class Tuwaiq {
    private String bootcamp_name;
    private String instructor_name;
    private int count_of_student;
    private double evaluate;

    public Tuwaiq() {

    }

    public Tuwaiq(String bootcamp_name, String instructor_name, int count_of_student, double evaluate) {
        this.bootcamp_name = bootcamp_name;
        this.instructor_name = instructor_name;
        this.count_of_student = count_of_student;
        this.evaluate = evaluate;
    }
    public String getBootcamp_name() {
        return bootcamp_name;
    }
    public void setBootcamp_name(String bootcamp_name) {
        this.bootcamp_name = bootcamp_name;
    }
    public String getInstructor_name() {
        return instructor_name;
    }
    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
    public int getCount_of_student() {
        return count_of_student;
    }
    public void setCount_of_student(int count_of_student) {
        this.count_of_student = count_of_student;
    }
    public double getEvaluate() {
        return evaluate;
    }
    public void setEvaluate(double evaluate) {
        this.evaluate = evaluate;
    }

    public ArrayList<Tuwaiq> getTopRate(ArrayList<Tuwaiq> bootcamp){
        ArrayList<Tuwaiq> topRate = new ArrayList<>();
        for (Tuwaiq t : bootcamp){
            if(t.getEvaluate() > 4.5){
                topRate.add(t);
            }
        }
        return topRate;
    }

    @Override
    public String toString() {
        return "Tuwaiq{" +
                "bootcamp_name='" + bootcamp_name + '\'' +
                ", instructor_name='" + instructor_name + '\'' +
                ", count_of_student=" + count_of_student +
                ", evaluate=" + evaluate +
                '}';
    }
}
