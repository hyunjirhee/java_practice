package rhee.MAIN;

public class FundamentalsPracticeQs {

public static void main(String[] args) {
	// Add $1.00 and $7.50 
	double x = 1; 
	double y = 7.50; 
	System.out.println("$" + (x+y));
	
	// Calculate the sales tax (9%) on a purchase of $20.34
	double cost = 20.34; 
	double salesTax = 0.09;
	System.out.println("The sales tax is " + "$" + cost*salesTax);
	
	// Calculate half the area of a rectangle whose length is 9 and whose width is 5.
	int l = 9; 
	int w = 5; 
	int area = l*w;
	double halfArea = (double)area/2;
	System.out.println(halfArea);

	// Calculate the area of a circle whose radius is 4.
	int r = 4; 
	double pi = 3.14;
	double areaT = pi*(r*r);
	System.out.println(areaT);
	
	// Calculate the perimeter of a rectangle whose length is 10 and whose width is 8.3.
	double lR = 10; 
	double wR = 8.3;
	double peri = 2 * (lR*wR);
	System.out.println(peri);
	
	// Calculate 10^5
	int i = 10; 
	int power = 5;
	System.out.println("10 to the power of 5 is " + Math.pow(i, power));
	
	// Calculate the number of hours in 724 minutes.
	int minutes = 724;
	int hours = 60 * minutes; 
	System.out.println(hours + " hours in 724 minutes");
	
	// Calculate the half the number of kilometers in 26 miles.
	double mls = 26; 
	double kms = 0.62 * mls;
	System.out.println(kms/2);
	
}
}
