package org.example.tuwaiqacademy;

public class Students{
    private String name;
    private String phone_number;
    private String email;
    private Tuwaiq bootcamp;

    public Students(String name, String phone_number, String email) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public Students(Tuwaiq tuwaiq, String name, String phone_number, String email) {
        this.bootcamp = tuwaiq;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public Tuwaiq getBootcamp() {
        return bootcamp;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", bootcamp=" + bootcamp +
                '}';
    }
}
