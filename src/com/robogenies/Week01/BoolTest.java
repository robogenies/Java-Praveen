package com.robogenies.Week01;

import java.util.Scanner;

public class BoolTest {

    public static void main(String[] args) {

        boolean flag=false;

        String x="Hello";

        if(x.isEmpty())
        {
            //5>6;
            System.out.println("IsEmpty:"+x.isEmpty());
        }
        else
        {
            System.out.println("IsEmpty:"+x.isEmpty());
        }


        Scanner in=new Scanner(System.in);
        String name="",married="",motherName="",wifeName="";
        boolean mFlag=false;

        System.out.println("Please enter your name:");
        name=in.next();
        System.out.println("Hello "+name+" are you married? (Yes or No):");
        married=in.next();
        if(married.equalsIgnoreCase("yes"))
        {
            mFlag=true;
        }
        else if(married.equalsIgnoreCase("No")) {
            mFlag=false;
        }
        else
        {
            System.out.println("Invalid input.. Please try again.");
        }

        if(mFlag==true) {
            System.out.println("Please enter your Wife name:");
            wifeName=in.next();
        }
        else {
            System.out.println("Please enter your Mother's name:");
            motherName=in.next();
        }

        if(mFlag)
        {
            System.out.println("Hello "+name+" You're married & your wife name is "+wifeName);
        }
        else
        {
            System.out.println("Hello "+name+" You're not married & your mother name is "+motherName);
        }

    }

}
