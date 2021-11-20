package com.robogenies.Week04.OOPSample;

public class Sample {

    public static void main(String args[]){

        Praveen praveenObj=new Praveen();

        praveenObj.setName("Praveen");

        praveenObj.printName();


    }

}

class Praveen
{
    String name;

    public void setName(String str)
    {
        name=str;
    }

    public void printName()
    {
        System.out.println(name);
    }

}


