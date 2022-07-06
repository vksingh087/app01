package app01;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.print("How many grades would you like to store? ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double d[]=new double[n];
		double sum=0;
		for(int i=0;i<d.length;i++)
		{
			System.out.print("Next grade? ");
			d[i]=s.nextDouble();
			sum=sum+d[i];
		}
		System.out.println("The average of your grades is "+sum/n);

	}

}
