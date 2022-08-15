package com.Clonableeg;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        Student hilal = new Student(14,82);
        Student mila = (Student) (hilal.clone());

        System.out.println(mila.marks +" "+ mila.rno);
    }
}
