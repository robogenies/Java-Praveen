package com.robogenies.Week05;

public class _01OverRiding {

    /*Method OverRiding

    Methods can be overriden using same method names & diff number / types of params;

     */

    public static void main(String[] args) {

        int a=10;

        print();
        print("Hi");

        System.out.println(add(7,3));
        System.out.println(add(4.5,6));



    }


    static void print()
    {
        System.out.println("Hello");
    }

    static void print(String input)
    {
        System.out.println(input);
    }

    void print(int x)
    {
        System.out.println("Hello");
    }

    int print(String input,String input2)
    {
        System.out.println("Hai");
        return 0;
    }

    static int add(int x,int y)
    {
        return x+y;
    }
    static double add(double x,double y)
    {
        return x+y;
    }
}
