package minutestodays;

import java.util.Scanner;

public class Minutestodays {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		double min;
		double days = 60 * 24;
		float year = 60*24*365;
		System.out.println("Number of Minutes:");
		min = S.nextDouble();
		System.out.println(min+ " minutes is approximately "+ min/year + " and " +min/days+  
				                          " days.");
		S.close();

	}

}
