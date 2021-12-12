package com.robogenies.Week03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _07ExceptionHandling {

    public static void main(String[] args)
    {
        int i;
        try {
            FileReader fr = new FileReader("Test1.txt");

            while ((i = fr.read()) != -1) {

            }

            System.out.println(5/0);
        }

        catch (FileNotFoundException ex)
        {
            System.out.println("Error:"+ex.toString());
        }
        catch(IOException ex)
        {
            System.out.println("Exception:"+ex.toString());
        }
        catch(Exception ex)
        {
            System.out.println("Exception:"+ex.toString());
        }

        System.out.println("Akash");


    }
}
