package foodpackage;

import java.awt.Desktop;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Desktop dk = new Desktop();
		
		System.out.println("Please enter 3 numbers (doubles)");
		
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		double k = sc.nextDouble();
		double sum = i+j+k;
		
		System.out.println("The sum of your number is " + sum );
		
		
	}

}
