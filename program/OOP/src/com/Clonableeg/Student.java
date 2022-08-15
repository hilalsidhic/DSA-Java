package com.Clonableeg;

public class Student implements Cloneable{
    int rno;
    int marks;

    public Student(int rno, int marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
