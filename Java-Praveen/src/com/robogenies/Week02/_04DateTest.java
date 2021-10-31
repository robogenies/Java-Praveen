package com.robogenies.Week02;

import java.util.Calendar;
import java.util.Date;

public class _04DateTest {

    public static void main(String[] args) {




        Date dateObj=new Date();

        System.out.println(dateObj.toString());

        System.out.println(dateObj.getDate());

        System.out.println(dateObj.getMonth());
        System.out.println(dateObj.getYear());

        System.out.println(dateObj.getHours());
        System.out.println(dateObj.getMinutes());
        System.out.println(dateObj.getSeconds());

        System.out.println(Calendar.getInstance().get(Calendar.YEAR));

        System.out.println(Calendar.getInstance().get(Calendar.MONTH));
        System.out.println(Calendar.getInstance().get(Calendar.DATE));

        int hr=Calendar.getInstance().get(Calendar.HOUR);
        System.out.println(hr);
        System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));

        System.out.println(Calendar.getInstance().get(Calendar.AM_PM));

        System.out.println(Calendar.getInstance().get(Calendar.ZONE_OFFSET));



    }

}
