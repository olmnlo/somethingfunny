package org.example.tuwaiqacademy.Entity;

import java.util.ArrayList;

public class Bootcamp {
    private String bootcamp_name;
    private int bootcamp_evaluation;

    public Bootcamp(String bootcamp_name, int bootcamp_evaluation) {
        this.bootcamp_name = bootcamp_name;
        this.bootcamp_evaluation = bootcamp_evaluation;
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

    @Override
    public String toString() {
        return "Bootcamp{" +
                "bootcamp_name='" + bootcamp_name + '\'' +
                ", bootcamp_evaluation=" + bootcamp_evaluation +
                '}';
    }
}
