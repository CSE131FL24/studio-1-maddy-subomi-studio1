package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want n1 to be?");
		int n1 = in.nextInt();
		System.out.println("What do you want n2 to be?");
		int n2 = in.nextInt();
		
		double average = (n1 + n2)/ 2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average);

	}

}
