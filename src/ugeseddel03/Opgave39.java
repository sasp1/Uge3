package ugeseddel03;

import java.text.DecimalFormat;

public class Opgave39 
{
	public static void main(String[] args)
	{
		metode1();
	}
	public static void metode1()
	{
		final int INITIAL_MONEY = 1000;
		final int DEPOSIT = 100; 
		final double INTEREST = 6.5;
		double totalMoney = 0; 
		
		
		totalMoney = INITIAL_MONEY; 
		System.out.print("YEAR\t\tCurrent balance\t\tInterest\tDeposit");
		for (int i = 1; i<=25; i++)
		{
			totalMoney = totalMoney*(1+(INTEREST/100));
			totalMoney += DEPOSIT;
			System.out.println();
			System.out.print(i + "\t\t");
			System.out.print( Math.round(totalMoney)+"\t\t\t");
			System.out.print(INTEREST+"\t\t");
			System.out.print(DEPOSIT);
		}
	}
	

}
