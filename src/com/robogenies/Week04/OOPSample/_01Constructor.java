package com.robogenies.Week04.OOPSample;

public class _01Constructor {

    public static void main(String[] args) {

    //Cons w/o param

    //Classname obj=new Constructor();
    ConTest conTest = new ConTest();

    //Cons with Param

    //Classname obj=new Constructor(param);
    ConTest conTest1 = new ConTest("Praveen");

    ConTest conTest2=new ConTest("Praveen","18");
}

}

class ConTest
{
    /*You can declare or define N no. of Constructors by changing the type or no. of params in the COns;

     */

    String name,age;


    ConTest()
    {
        System.out.println("Hi I'm a Constructor\n Object created Successfully!");
    }

    ConTest(String name)
    {
        System.out.println("Hi "+name+" I'm a Constructor with Parameter\nObject created Successfully!");
    }
    ConTest(int x){

    }
    ConTest(int x,int y)
    {

    }

    ConTest(String x,String y)
    {
        name=x;
        age=y;
    }
}
