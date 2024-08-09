

import java.util.Scanner;

public class Rodent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         Scanner scanner = new Scanner(System.in);
		         System.out.print("Enter initial population of Rodents of Unusual Size: ");
		         int numberPeople = scanner.nextInt();
		         if (numberPeople <= 300) {
		             System.out.print("Population must be at least 300. Please enter again: ");
		             numberPeople = scanner.nextInt();
         }
		
		         System.out.print("Enter annual population grown percentage: ");
		         double numberCount = scanner.nextDouble();
		         if(numberCount < 0) {
        	 
        	    System.out.print("Percentage increase cannot be negative, please enter again: ");
        	    numberCount = scanner.nextDouble();
        	 
         }
		         System.out.print("Enter number of years to estimate population: ");
		         int years = scanner.nextInt();
		         while (years < 10) {
		             System.out.print("Number of years must be at least 10. Please enter again: ");
		             years = scanner.nextInt();
		         }
		         System.out.println("Year\tPopulation");
		         for (int year = 1; year <= years; year++) {
		             System.out.printf("%d\t%d%n", year, numberPeople);
	numberPeople  += numberPeople*numberCount/100;
		         }

		         scanner.close();

    }
}