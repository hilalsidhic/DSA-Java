package com.statics;

public class Singleton {
    private Singleton (){

    }
    private static Singleton instance;
    public static Singleton getinstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
class Mai2n{
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getinstance();
        Singleton obj2 = Singleton.getinstance();
    }
}
