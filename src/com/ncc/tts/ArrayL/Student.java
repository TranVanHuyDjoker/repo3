package com.ncc.tts.ArrayL;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "name = " + name + ", age = " + age ;
    }

    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<Student>();

        Student student1 = new Student("Bac", 17);
        Student student2 = new Student("Nam", 20);
        Student student3 = new Student("Trung", 19);

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);

        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }
}
