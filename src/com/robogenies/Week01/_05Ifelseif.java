package com.robogenies.Week01;

import java.util.Scanner;

public class _05Ifelseif {
    public static void main(String args[])
    {
        int x;

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        x=in.nextInt();

        if(x==0)
        {
            System.out.println("Number is Zero!");
        }
        else if(x%2==1)
        {
            System.out.println("Number is ODD!");
        }

        else
        {
            System.out.println("Number is Even!");
        }

        
    }
}
