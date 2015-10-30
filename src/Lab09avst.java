// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09avst
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
	
	public static int getnum(){
		return num;
	}
	
	public static int getden(){
		return den;
	}
	
}


class Rational
{	
	public Rational(int num, int den) {
		num = Lab09avst.getnum();
		den = Lab09avst.getden();
	}

	public static double getNum(){
		double num = Lab09avst.getnum();
		return num;
	}
	
	public static double getDen(){
		double den = Lab09avst.getden();
		return den;
	}
	
	public static double getDecimal(){
		double dem = getNum() / getDen();
		return dem;
	}
	public void displayData()
	{
		System.out.println();
		System.out.println((int) getNum() + "/" + (int) getDen() + " equals " + getDecimal());
		System.out.println();
	}


	private void getGCF(int n1,int n2)
	{
		int gcf;
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}





