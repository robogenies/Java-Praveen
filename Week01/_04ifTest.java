package com.robogenies.Week01;

public class _04ifTest {
    public static void main(String args[])
    {
        int age;
        String name;
        name="Kamal";
        age=18;

        /*
        If Syntax
        if(condition)
        {
            ...
            Action block
            ...
            ...
        }
        else
        {
            ...
            Action block
            ...
            ...
        }
        */

        if(age>=18)
        {
            System.out.println(name+" is eligible to Vote!");
        }
        else
        {
            System.out.println(name+" is not eligible to Vote!");
        }
        
    }
}
