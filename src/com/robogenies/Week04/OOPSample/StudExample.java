package com.robogenies.Week04.OOPSample;

import java.util.Scanner;

public class StudExample {


    public static void main(String[] args) {


        //ClassName obj=new Constructor();

        Students stud1 = new Students();
        Students stud2 = new Students();

        //Scanner in=new Scanner(System.in);
        //System.out.print("Enter Student 1 Name:");
        //stud1.name=in.nextLine();

        stud1.name="Akash";
        stud1.marks=350.5f;
        stud1.age=18;
        stud1.mail="iamakashrajasingh@gmail.com";

        stud2.name="Praveen";
        stud2.marks=400;
        stud2.mail="praveen@gmail.com";
        stud2.age=19;

        System.out.println(stud2.name);




    }




}


/*Access Modifiers

    public, private, default, protected

*/

class Students
{
    public String name,mail;
    float marks;
    int age;

}