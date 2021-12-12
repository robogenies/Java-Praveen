package com.robogenies.Week03;
import java.io.*;


public class _05FileWrite {

	public static void main(String args[])
	{

		try{

			// I/P Data
			String msg="Hello World!";

			//Class to write File

			FileWriter fw=new FileWriter("Test1.txt");
			fw.write(msg);

			fw.close();
 
		}

		catch(Exception ex)
		{
			System.out.print("Error caught!\n Reason:"+ex.toString());
		}
	}

}
