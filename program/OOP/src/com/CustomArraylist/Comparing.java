package com.CustomArraylist;

public class Comparing implements Comparable<Comparing>{
    int rno;
    int marks;

    public Comparing(int rno, int marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+"";
    }

    @Override
    public int compareTo(Comparing o) {
        return (int)(this.marks-o.marks);
    }
}
