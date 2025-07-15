package org.example.tuwaiqacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    ArrayList<Tuwaiq> tuwaiqs = new ArrayList<>();
    ArrayList<Students> students = new ArrayList<>();
    public Controller() {
        tuwaiqs.add(new Tuwaiq("Java Spring Boot", "Majd", 20, 5));
        tuwaiqs.add(new Tuwaiq("Java Script", "Ahmed", 19, 4.5));
        tuwaiqs.add(new Tuwaiq("Flutter", "Faisal", 18, 4));

        // Students for Java Spring Boot
        students.add(new Students(tuwaiqs.get(0), "Hussam", "05050505", "hussam@email.com"));
        students.add(new Students(tuwaiqs.get(0), "Mona", "05011111", "mona@email.com"));
        students.add(new Students(tuwaiqs.get(0), "Omar", "05022222", "omar@email.com"));

        // Students for JavaScript
        students.add(new Students(tuwaiqs.get(1), "Sara", "05555555", "sara@email.com"));
        students.add(new Students(tuwaiqs.get(1), "Fahad", "05512345", "fahad@email.com"));
        students.add(new Students(tuwaiqs.get(1), "Noura", "05567890", "noura@email.com"));

        // Students for Flutter
        students.add(new Students(tuwaiqs.get(2), "Ali", "05444444", "ali@email.com"));
        students.add(new Students(tuwaiqs.get(2), "Rania", "05433333", "rania@email.com"));
        students.add(new Students(tuwaiqs.get(2), "Yousef", "05422222", "yousef@email.com"));
    }

    @GetMapping("/top-bootcamps")
    public ArrayList<Tuwaiq> getTopRated(){
        ArrayList<Tuwaiq> topRated = new ArrayList<>();
        for (Tuwaiq tuwaiq : tuwaiqs) {
            if(tuwaiq.getEvaluate() > 4.5){
                topRated.add(tuwaiq);
            }
        }
        return topRated;
    }

    @GetMapping("/bootcamps")
    public ArrayList<Tuwaiq> getTuwaiqs(){
        return tuwaiqs;
    }


    @GetMapping("/students")
    public ArrayList<Students> getStudents(){
        return students;
    }

    @GetMapping("/students/spring-boot")
    public ArrayList<String> getSpringbootStudents(){
        ArrayList<String> bootstudent = new ArrayList<>();
        for (Students student: students) {
            if(student.getBootcamp().getBootcamp_name().equals("Java Spring Boot")){
                bootstudent.add(student.toString());
            }
        }
        return bootstudent;
    }

    @GetMapping("/students/java-script")
    public ArrayList<String> getJavaScriptStudents(){
        ArrayList<String> bootstudent = new ArrayList<>();
        for (Students student: students) {
            if(student.getBootcamp().getBootcamp_name().equals("Java Script")){
                bootstudent.add(student.toString());
            }
        }
        return bootstudent;
    }

    @GetMapping("/students/flutter")
    public ArrayList<String> getFlutterStudents(){
        ArrayList<String> bootstudent = new ArrayList<>();
        for (Students student: students) {
            if(student.getBootcamp().getBootcamp_name().equals("Flutter")){
                bootstudent.add(student.toString());
            }
        }
        return bootstudent;
    }



}
