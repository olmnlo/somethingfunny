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
        // students1
        ArrayList<Students> students1 = new ArrayList<>();
        Students s1 = new Students("Hussam", "hussam@gmail.com", "23");
        Students s2 = new Students("Faisal", "faisal@gmail.com", "24");
        students1.add(s1);
        students1.add(s2);

// students2
        ArrayList<Students> students2 = new ArrayList<>();
        Students s3 = new Students("Aisha", "aisha@gmail.com", "22");
        Students s4 = new Students("Tariq", "tariq@gmail.com", "25");
        students2.add(s3);
        students2.add(s4);

// students3
        ArrayList<Students> students3 = new ArrayList<>();
        Students s5 = new Students("Noor", "noor@gmail.com", "21");
        Students s6 = new Students("Saad", "saad@gmail.com", "26");
        students3.add(s5);
        students3.add(s6);

// students4
        ArrayList<Students> students4 = new ArrayList<>();
        Students s7 = new Students("Rami", "rami@gmail.com", "24");
        Students s8 = new Students("Dana", "dana@gmail.com", "23");
        students4.add(s7);
        students4.add(s8);

// students5
        ArrayList<Students> students5 = new ArrayList<>();
        Students s9 = new Students("Yara", "yara@gmail.com", "22");
        Students s10 = new Students("Ali", "ali@gmail.com", "25");
        students5.add(s9);
        students5.add(s10);

// students6
        ArrayList<Students> students6 = new ArrayList<>();
        Students s11 = new Students("Khalid", "khalid@gmail.com", "26");
        Students s12 = new Students("Mona", "mona@gmail.com", "21");
        students6.add(s11);
        students6.add(s12);



        Instructor i1 = new Instructor("Majd", "majd@gmail.com");
        Instructor i2 = new Instructor("Sara", "sara@gmail.com");
        Instructor i3 = new Instructor("Omar", "omar@gmail.com");
        Instructor i4 = new Instructor("Laila", "laila@gmail.com");
        Instructor i5 = new Instructor("Khalid", "khalid@gmail.com");
        Instructor i6 = new Instructor("Rana", "rana@gmail.com");

        Bootcamp b1 = new Bootcamp("Java Spring Boot", 5, i1, students1);
        Bootcamp b2 = new Bootcamp("Frontend Development", 4.3,  i2, students2);
        Bootcamp b3 = new Bootcamp("Python for Data Science", 3,  i3, students3);
        Bootcamp b4 = new Bootcamp("Mobile App Development", 4.7,   i4, students4);
        Bootcamp b5 = new Bootcamp("DevOps and Cloud", 3,   i5, students5);
        Bootcamp b6 = new Bootcamp("Cybersecurity Essentials", 4,   i6, students6);

        tuwaiq.addStudents(s1);
        tuwaiq.addStudents(s2);
        tuwaiq.addStudents(s3);
        tuwaiq.addStudents(s4);
        tuwaiq.addStudents(s5);
        tuwaiq.addStudents(s6);
        tuwaiq.addStudents(s7);
        tuwaiq.addStudents(s8);
        tuwaiq.addStudents(s9);
        tuwaiq.addStudents(s10);
        tuwaiq.addStudents(s11);
        tuwaiq.addStudents(s12);
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

    @GetMapping("/students")
    public ArrayList<Students> getStudents(){
        return tuwaiq.getStudents();
    }

    @GetMapping("/bootcamps")
    public ArrayList<Bootcamp> getBootcamps(){
        return tuwaiq.getBootcamps();
    }

    @GetMapping("/instructors")
    public ArrayList<Instructor> getInstructors(){
        return tuwaiq.getInstructors();
    }

    @GetMapping("/students/spring-boot")
    public ArrayList<Students> StudentsSpringboot(){
        return tuwaiq.getStudentsSpringboot();
    }

    @GetMapping("/students/frontend")
    public ArrayList<Students> StudentsFrontend(){
        return tuwaiq.getStudentsFrontend();
    }

    @GetMapping("/students/python")
    public ArrayList<Students> StudentsPython(){
        return tuwaiq.getStudentsPython();
    }

    @GetMapping("/students/mobile-app-development")
    public ArrayList<Students> StudentsMobileAppDevelopment(){
        return tuwaiq.getStudentsMobileAppDevelopment();
    }

    @GetMapping("/students/devOps-and-cloud")
    public ArrayList<Students> StudentsDevOpsAndCloud(){
        return tuwaiq.getStudentsDevOpsAndCloud();
    }

    @GetMapping("/students/cybersecurity")
    public ArrayList<Students> StudentsCybersecurity(){
        return tuwaiq.getStudentsCybersecurity();
    }

    @GetMapping("/bootcamps/top")
    public ArrayList<Bootcamp> BootcampTop(){
        return tuwaiq.getTopBootcamps();
    }
}




