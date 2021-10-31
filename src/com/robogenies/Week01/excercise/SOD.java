package com.robogenies.Week01.excercise;

public class SOD{

	public static void main(String args[])
	{
		int x=123,digit,res=0;
		
		while(x>0)
		{

			//1--- digit=3;
			//res=0+3; res=3;
			//123/10 = x = 12;


			//2--- digit=12%10; digit = 2;
			//res=3+2; res=5;
			//x=12/10; x=1;

			//3--- digit=1%10; digit=1;
			//res=5+1; res=6;
			//x=1/10; x=0;	
		

			digit=x%10;
			res=res+digit;
			x=x/10;
			System.out.println("Digit:"+digit);
		}

		System.out.println("\n\nThe sum of digits="+res);
	}

}
