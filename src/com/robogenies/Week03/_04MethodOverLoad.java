package com.robogenies.Week03;

public class _04MethodOverLoad {

    public static void main(String[] args) {

        System.out.println(add(5,4));
        System.out.println(add(0.6,0.7));

        System.out.println( add(0.7,5));

        System.out.println( add("Ravi","Kumar"));

    }

    static int add(int x,int y)
    {
        return x+y;
    }

    static double add(double a,double b)
    {
        return a+b;
    }

    static String add(String fName,String lName)
    {
        return fName+" "+lName;
    }

}
