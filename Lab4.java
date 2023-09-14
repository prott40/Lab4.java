import java.util.*;
/*<Lab4.java
 * <Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
 *<This program is designed to collect what you want to invest and how long and at what percent. 
 *<then uses reference table to find what the percent of coumpnding interest for the years would be.
 *Finds compuned value and the interst value
 *Result ins for each client is printed> 
 */
public class Lab4 {
  public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);

	double [] [] table = {  {1.05, 1.06, 1.07, 1.08, 1.09, 1.10},//row 1
				{1.1025, 1.1236, 1.1449, 1.1664, 1.1881, 1.21},	//row 2
				{1.1576250, 1.1910160, 1.2250430, 1.2597120, 1.2950290, 1.331},	//row 3
				{1.2155063, 1.2624770, 1.3107960, 1.3604890, 1.4115816, 1.4641},//row 4
				{1.2762816, 1.3382256, 1.4025517, 1.4693281, 1.5386240, 1.61051}, //row 5
				{1.3400956, 1.4185191, 1.5007304, 1.5868743, 1.6771001, 1.771561}, //row 6
				{1.4071004, 1.5036303, 1.6057815, 1.7138243, 1.8280391, 1.9487171}, //row 7
				{1.4774554, 1.5938481, 1.7181862, 1.8509302, 1.9925626, 2.1435888}, //row 8
				{1.5513282, 1.6894790, 1.8384592, 1.9990046, 2.1718933, 2.3579477}, //row 9
				{1.6288946, 1.7908477, 1.9671514, 2.1589250, 2.3673637, 2.5937425} //row 10
	}; // end declaration and initialization of 2D array

	// Declare String [ ] and int array(s) here
	final int NUM = 3;
String []clients = new String[NUM];
int []invest = new int[NUM];
int []interest = new int[NUM];
int []years = new int[NUM];

	// Declare for loop used for input here
for(int i = 0; i<NUM;++i) {
	System.out.print("Enter client's name: ");
	clients[i] = s.nextLine();
	System.out.print("Enter amount to be invested($100-$10,000): ");
	invest[i] = Integer.parseInt(s.nextLine());
	while(invest[i]<100||invest[i]>10000) {
		System.out.print("Invalid,re-Enter amount to be invested($100-$10,000): ");
		invest[i] = Integer.parseInt(s.nextLine());
	}
	System.out.print("Enter intrest rate(5%-10%): ");
	interest[i] = Integer.parseInt(s.nextLine());
	while(interest[i]<5||interest[i]>10) {
		System.out.print("Invalid,re-Enter interest rate(5%-10%): ");
		interest[i] = Integer.parseInt(s.nextLine());
	}
	System.out.print("Enter investment years(1-10): ");
	years[i] = Integer.parseInt(s.nextLine());
	while(years[i]<1||years[i]>10) {
		System.out.print("Invalid,re-Enter investment years(1-10): ");
		years[i] = Integer.parseInt(s.nextLine());
	}
}
for(int i = 0; i< NUM; ++i) {
	//DecimalFormat df = new DecimalFormat("#,###,###.##");
	
	double value = table[years[i]-1][interest[i]-5] * invest[i];
	double intr = value - invest[i];
	System.out.printf("%s\tCompund Value: $%,.2f\t\tInterest: $%,.2f",clients[i],value,intr);
	System.out.println();
}
	
	
	// Declare for loop for output here

s.close();
 } // end main
} // end class
