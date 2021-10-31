package com.robogenies.Week01;

public class _07SwitchTest {
    public static void main(String args[])
    {
        /*

        SWITCH Syntax

        switch(choice)
        {
            case x:
                ....
                Action Block
                ....
                break;

            case y:
                ....
                Action Block
                ....
                break;
            
            default:
                ....
                Action Block
                ....
                break;

        }

        */

        String name;
        String grade;

        
       
        grade="Z";

        switch(grade)
        {
            case "A":
                System.out.println("EXCELLENT");
                break;

            case "B":
                System.out.println("GOOD");
                break;

            case "C":
                System.out.println("FAIR");
                break;

            case "D":
                System.out.println("POOR");
                break;

            default:
                System.out.println("GRADE NOT FOUND");
                break;
        }


    }
}
