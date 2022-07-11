public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student hilal = new Student();
        Student mila = new Student(12,"mila",92.8f);
        Student bila = new Student(hilal);
        Student ardee = new Student();
        System.out.println(hilal.rno);
        System.out.println(bila.name);
        System.out.println(bila.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student (){                     //Constuctor
        this (13,"default",84.5f);
    }
    Student (int rno,String name,float marks){
        this.rno = rno;                                     //parameterised constuctors
        this.name = name;
        this.marks = marks;
    }
    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}