package com.robogenies.Week03;

import java.io.FileReader;

public class _06FileRead {

    public static void main(String args[])
    {
        int i=0;
        String msg="";

        try {
            FileReader fr = new FileReader("Test1.txt");

            while ((i = fr.read()) != -1) {
                //Parsing-->Datatype to Datatype
                //f=7.3;
                //(int)f=7;
                //i=5;
                //(double)i=5.0;
                //c='a';
                //(int)c=61

                System.out.println((char) i+" : "+i);
                msg=msg+(char)i;

            }

            //(x+y)+z=40;


            fr.close();
        }
        catch(Exception ex)
        {
            System.out.print(ex.toString());
        }
        System.out.println(msg);
    }

    /*
    Enter Source file: /users/praveen/downloads/hello.txt
    Enter Destination File: /users/praveeen/documents/hi.txt
    File Copied succesfully!

     */

}
