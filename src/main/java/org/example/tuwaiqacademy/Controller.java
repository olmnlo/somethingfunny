package org.example.tuwaiqacademy;

import org.example.tuwaiqacademy.Entity.Bootcamp;
import org.example.tuwaiqacademy.Entity.Instructor;
import org.example.tuwaiqacademy.Entity.Students;
import org.example.tuwaiqacademy.Entity.Tuwaiq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    Tuwaiq tuwaiq = new Tuwaiq(new ArrayList<Instructor>(), new ArrayList<Students>(), new ArrayList<Bootcamp>());

    public Controller() {
        Students s1 = new Students("Hussam", "hussam@gmail.com", "23");
        Students s2 = new Students("Aisha", "aisha@gmail.com", "21");
        Students s3 = new Students("Fahad", "fahad@gmail.com", "24");
        Students s4 = new Students("Lama", "lama@gmail.com", "22");
        Students s5 = new Students("Rayan", "rayan@gmail.com", "25");
        Students s6 = new Students("Noura", "noura@gmail.com", "20");


        Bootcamp b1 = new Bootcamp("Java Spring Boot", 5);
        Bootcamp b2 = new Bootcamp("Frontend Development", 4);
        Bootcamp b3 = new Bootcamp("Python for Data Science", 6);
        Bootcamp b4 = new Bootcamp("Mobile App Development", 5);
        Bootcamp b5 = new Bootcamp("DevOps and Cloud", 3);
        Bootcamp b6 = new Bootcamp("Cybersecurity Essentials", 4);

        Instructor i1 = new Instructor("Majd", "majd@gmail.com");
        Instructor i2 = new Instructor("Sara", "sara@gmail.com");
        Instructor i3 = new Instructor("Omar", "omar@gmail.com");
        Instructor i4 = new Instructor("Laila", "laila@gmail.com");
        Instructor i5 = new Instructor("Khalid", "khalid@gmail.com");
        Instructor i6 = new Instructor("Rana", "rana@gmail.com");

        tuwaiq.addStudents(s1);
        tuwaiq.addStudents(s2);
        tuwaiq.addStudents(s3);
        tuwaiq.addStudents(s4);
        tuwaiq.addStudents(s5);
        tuwaiq.addStudents(s6);
        tuwaiq.addInstructor(i1);
        tuwaiq.addInstructor(i2);
        tuwaiq.addInstructor(i3);
        tuwaiq.addInstructor(i4);
        tuwaiq.addInstructor(i5);
        tuwaiq.addInstructor(i6);
        tuwaiq.addBootcamp(b1);
        tuwaiq.addBootcamp(b2);
        tuwaiq.addBootcamp(b3);
        tuwaiq.addBootcamp(b4);
        tuwaiq.addBootcamp(b5);
        tuwaiq.addBootcamp(b6);


    }


    @GetMapping("/all-data")
    public Tuwaiq getAllData(){
        return tuwaiq;
    }
}




