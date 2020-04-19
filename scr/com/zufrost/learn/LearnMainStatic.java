package com.zufrost.learn;

public class LearnMainStatic {
    public static void main(String[] args) {
        Student student1 = new Student(42);
        Student student2 = new Student(77);
        Student.faculty = "MMF";
//        student1 = null;
//        student1.faculty = "GEO";
        System.out.println(student1.faculty);
    }
}
