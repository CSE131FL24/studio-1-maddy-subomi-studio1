package studio1;

import java.util.Scanner;



	
public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("Choose a year?");
int year = in.nextInt ();
boolean leapyear;

if ((year % 4 == 0) && (year%100 != 0)) {
leapyear = true;



}
else { leapyear = false;
}

System.out.println (year + "is a leap year:" + leapyear);
}
}
