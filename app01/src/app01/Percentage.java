package app01;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) 
	{
		double per=0.0;
		try 
		{
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the point earned: ");
			 int a=s.nextInt();
			 System.out.print("Enter the point Possible: ");
			 int b=s.nextInt();
			 per=(a*100)/b;
			 System.out.println("Percentage: "+per);
			 
		} 
		catch (Exception e)
		{
			per=0.0;
			System.out.println("Percentage: "+per);
		}

	}

}
