package com.robogenies.Week01.excercise;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalc {

    public static void main(String[] args) {
        int mm,dd,yyyy;
        int MM,DD,YYYY;
        int mon,days,years;


        Scanner in=new Scanner(System.in);

        System.out.println("Enter your Date of Birth (DD):");
        dd=in.nextInt();

        System.out.println("Enter your Month of Birth (MM):");
        mm=in.nextInt();

        System.out.println("Enter your Year of Birth (YYYY):");
        yyyy=in.nextInt();

        DD=Calendar.getInstance().get(Calendar.DATE);
        MM=Calendar.getInstance().get(Calendar.MONTH);
        YYYY=Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Current Date: "+DD+"/"+MM+"/"+YYYY);
        System.out.println("Your DOB: "+dd+"/"+mm+"/"+yyyy);

        years=YYYY-yyyy;
        mon=MM-mm;
        days=DD-dd;


        if(yyyy%4==0)
        {

        }

        if(dd>DD)
        {
            if(mm>=MM)
            {
                years=years-1;
            }

        }



        System.out.println(years+" Years");
        System.out.println(mon+" Months");
        System.out.println(days+" Days");
    }

}
