package ugeseddel03;

import java.util.Scanner;

public class Opgave38 {

	public static void main(String[] args) {
		 
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter your full name:");
		String forNavn = console.next();
		String efterNavn = console.next();
		System.out.println("Your name in reverse order is " + efterNavn + ", " + forNavn);
		console.close();
	}

}
