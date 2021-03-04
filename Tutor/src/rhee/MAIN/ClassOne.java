package rhee.MAIN;

import java.util.Scanner;

public class ClassOne {
	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);	

	System.out.println("input your name");	
	String name = sc.next();
	
	System.out.println("\ninput your city");
	String city = sc.next();
	
	System.out.println("\ninput your age");
	int age = sc.nextInt();
	
	System.out.println("\ninput your height");
	double height = sc.nextDouble();
	
	System.out.println("\nyour name is "+name);
	System.out.println("your city is "+city);
	System.out.println("your age is "+age);
	System.out.println("your height is "+height);
	
	sc.close();
	}
}
	
