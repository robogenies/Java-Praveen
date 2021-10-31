package com.robogenies.Week01;

import java.util.Scanner;

public class _06NestIf {
    
    public static void main(String args[])
    {
        String username,password;

        Scanner scanObj=new Scanner(System.in);
        username=scanObj.next();
        password=scanObj.next();

        if(!username.equals(" "))
        {
            if(!password.equals(" "))
            {
                if(username.equals("akash") && password.equals("1234"))
                {
                    System.out.println("Login Success!!!");
                }
                else{
                    System.out.println("Login failed!");
                }
            }
            else
            {
                System.out.println("Pls enter Password!");    
            }
        }
        else{
            System.out.println("Pls enter username!");
        }

    }
}
