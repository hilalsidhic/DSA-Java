package com.CustomArraylist;
//Generics
public class Customarraylist<T> {
    Object[] arr;
    int sizeofarray = 10;
    int size = 0;

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size ; i++) {
            s+=arr[i]+",";
        }
        return s;
    }

    public Customarraylist() {
        this.arr = new Object[sizeofarray];
    }

    public void add(T num) {
        if(isFull()){
            resize();
        }
        arr[size++]=num;
    }

    private void resize() {
        sizeofarray*=2;
        Object[] temp = new Object[sizeofarray];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr=temp;
    }

    private boolean isFull() {
        return size == sizeofarray;
    }

    public void removeLast(){
        --size;
    }


}
