package com.robogenies.Week07;

public class _01StaticEx {

    public static void main(String[] args) {
        Praveen.printName();
        Praveen praveen=new Praveen();
        praveen.printAge();

        //System.out.println("Arg1:"+args[0]);

    }

}


class Praveen
{
    //
    static void printName()
    {
        System.out.println("Praveen");
    }

    void printAge()
    {
        System.out.println("15");
    }
}