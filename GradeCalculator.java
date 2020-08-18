package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void main(String[] args) {
		
		float marks;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Your Marks:");
        marks = s.nextFloat();
        if(marks>90)
        {
           System.out.println("A Grade");
	    }
        else if(marks <= 90 && marks>80)
        {
        	System.out.println("B Grade");
        }
        else if(marks <= 80 && marks>70)
        {
        	System.out.println("C Grade");
        }
        else if(marks <= 70 && marks>60)
        {
        	System.out.println("D Grade");
        }
        else if(marks <= 60 && marks>50)
        {
        	System.out.println("F Grade");
        }
        else
        {
        	System.out.println("Fail");
        }
        	
	}  

}
