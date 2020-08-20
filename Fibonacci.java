package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    
	public static void main(String[] args) {
		int f0=0;
		int f1=1;
		Scanner scan = new Scanner(System.in);
		int n, f2, i=2;
		System.out.print("Enter the number of terms in Fibonacci Series:");
		n = scan.nextInt();
		System.out.print(f0+ " " + f1);
		while(i<n) {
			f2=f0+f1;
		    f0=f1;
		    f1=f2;
		    i=i+1;
		    System.out.print(" " + f2);
		}
		scan.close();

	}

}
