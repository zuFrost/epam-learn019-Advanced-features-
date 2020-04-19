package com.zufrost.learn;

public class Student {
    static {
        faculty = "MMF";
//        int  a = 1/0;
    }
    static  String faculty;
    private long studentId;
    private String name = "";
    private int yearOfStudy;

    public Student(long studentId) {
        this.studentId = studentId;
    }
    public static void convertFaculty(String head) {
        System.out.println(head + " " + faculty.toLowerCase());
    }
}
