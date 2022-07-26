package com.CustomArraylist;

import java.util.Arrays;

public class Main implements GenericInterface<Integer> {
    public static void main(String[] args) {
        Customarraylist<String> list = new Customarraylist();
        list.add("1");
        list.add("2");
        for (int i = 0; i < 32; i++) {
            list.add(i+"");
        }
        System.out.println(list.toString());
        list.removeLast();
        list.add("4sf");
        System.out.println(list);

        Comparing hilal = new Comparing(12,76);
        Comparing mila = new Comparing(13,66);
        Comparing jol = new Comparing(11,86);

        Comparing[] stud = {hilal,mila,jol};
        Arrays.sort(stud);
        System.out.println(Arrays.toString(stud));

    }

    @Override
    public void display(Integer num) {
        System.out.println( num);
    }
}
