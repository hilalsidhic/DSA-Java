package com.statics;

public class InnerClass {
    static class Classinside{
        int num;

        @Override
        public String toString() {
            return this.num+"";
        }

        public Classinside(int num) {
            this.num = num;

        }
    }

    public static void main(String[] args) {
        Classinside brain = new Classinside(21);
        System.out.println(brain);
    }
}
