package com.robogenies.Week07;

public class StrToAscii {

    public static void main(String[] args) {

        String name="Praveen \"";

        for(int i=0;i<name.length();i++)
        {
            System.out.println("Char of "+name.charAt(i)+" = "+(int)name.charAt(i));
        }

        char A='a';

        System.out.print((int)A);

    }

}
