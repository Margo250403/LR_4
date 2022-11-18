package com.example.students;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

    public Student(String name, String groupNumber){
        this.name=name;
        this.groupNumber=groupNumber;
    }
    public String getName(){
        return name;
    }
    public String getGroupNumber(){
        return groupNumber;
    }
    private final static ArrayList<Student> students=new ArrayList<Student>(Arrays.asList(
            new Student("Рубан Єлизавета", "301"),
            new Student("Качан Маргарита", "301"),
            new Student("Рясик Ілона", "302"),
            new Student("Буньятов Азим", "302"),
            new Student("Раджабова Саміра", "308"),
            new Student("Фефелов Дмитро", "308"),
            new Student("Варава Руслана", "309"),
            new Student("Варава Андрій", "309")

    ));
    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stList=new ArrayList<>();
        for(Student s: students){
            if(s.getGroupNumber().equals(groupNumber)){
                stList.add(s);
            }
        }
        return stList;
    }
}