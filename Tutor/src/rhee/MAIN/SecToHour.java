package rhee.MAIN;

import java.util.Scanner;

public class SecToHour {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);	

		System.out.println("input seconds");	
		String sec = sc.next();
		
		int secs = Integer.valueOf(sec);
		double min = (secs/60);
		double hour = (min/60);
		
		System.out.print(secs + " seconds is ");
		System.out.print(min + " minutes, ");
		System.out.print(hour + " hours.");

		
		sc.close();
	}
}
