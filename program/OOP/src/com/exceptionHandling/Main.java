package com.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            throw new CustomException("Not working");
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally  term");
        }
    }
    public static int divide (int a , int b) throws ArithmeticException{
        if (b==0)
            throw new ArithmeticException("do not add zero as the denominator");
        return a/b;
    }
}
