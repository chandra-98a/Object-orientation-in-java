package com.capgemini.oo1;

public class Student {
    String studName, schoolName;
    double studId,percentage;

}
class LaunchExamination{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.studName="Ramu";
        s2.schoolName="RavindraBharati";
        s3.studId=123;
        s2.percentage= 94;


        System.out.println(s1.studName);
        System.out.println(s2.percentage);
    }
}
