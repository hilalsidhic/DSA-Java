package com.hilal;

import java.util.Arrays;

public class Sentencesort {

    public static void main(String[] args) {
        String newstr = "KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1";
        String[] str=newstr.split(" ");
        System.out.println(Arrays.toString(str));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            int num= str[i].charAt(str[i].length()-1)-48;
            swap(str,i,num-1);
            System.out.println(num-1);
        }
        if(builder.equals(builder))
        for (int j = 0; j < str.length; j++) {
            str[j]=str[j].replaceAll("[0-9]", "");
            builder.append(str[j]+" ");
        }
        System.out.println(builder);
    }
    public static void swap(String[] str,int i,int num){
        String temp = str[i];
        str[i] = str[num];
        str[num] = temp;
    }

}
