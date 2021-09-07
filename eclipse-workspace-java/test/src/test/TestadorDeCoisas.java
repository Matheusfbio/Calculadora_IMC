package test;

import java.util.Scanner;

public class TestadorDeCoisas {
  
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		
		float number1;
		float number2;
		float sum;
		
		System.out.print("digite o primeiro numero: ");
		number1 = input.nextFloat();
		
		System.out.print("digite o segundo numero: ");
		number2 = input.nextFloat();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %2f%n", sum);
	
	}
}
