package generalconcepts;

import java.util.Scanner;

public class Switchcaseforweek {
	public static void main(String[] args) {
		System.out.println("enter the value:");
		for (int i = 1; i <= 7; i++) {
			int week;

			Scanner s = new Scanner(System.in);
			week = s.nextInt();

			switch (week) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid");
				break;

			}
		}
	}
}
