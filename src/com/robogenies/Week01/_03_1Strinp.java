package com.robogenies.Week01;

import java.util.Scanner;

public class _03_1Strinp {
    

    public static void main(String args[])
    {
        String name;
        int age;
        boolean isVaccinated;
        double height;

        Scanner vacDetails=new Scanner(System.in);


        //next(); -->String IP
        //nextInt() --> Numbers IP
        //nextDouble() --> Decimals IP
        //nextBoolean() --> Boolean IP

        System.out.print("Enter Name:\t");
        name = vacDetails.next();
        System.out.print("Enter Age:\t");
        age = vacDetails.nextInt();
        System.out.print("Enter Height:\t");
        height = vacDetails.nextDouble();
        System.out.print("Vaccinated (Enter true or false) :\t");
        isVaccinated=vacDetails.nextBoolean();

        System.out.print("Week01.Hello I'm "+ name +" And my Age is "+age+" And Height is "+height+" IsVaccinated:"+isVaccinated);

    }

}
