package ugeseddel03;

import java.util.Scanner;

public class Opgave33 {

	public static void main(String[] args) 
	{
		printNumbers();

	}
	public static void printNumbers()
	{
		Scanner console = new Scanner(System.in);
		int max = console.nextInt();
		for (int i = 1; i <=max; i++)
		{
			System.out.print("[" + i + "]");
		}
		console.close();
	}
	
}
