package rhee.MAIN;

public class ConditionalStatementsPQ {

	public static void main(String[] args) {

	// If x is greater than y display “x greater than y”
	int x=4, y=2;
	if (x>y) {
		System.out.println("x is greater than y");
	}
	
	// if Age less than 18 display ‘cannot vote’ if Age greater than or equal to 18 display ‘can vote’.
	int age = 19;
	if (age<18) {
		System.out.println("cannot vote");
	}
	
	if (age>=18) {
		System.out.println("can vote");
	}
	
	// if Age greater than 16 AND has a car display ‘can drive’ else displays ‘cannot drive’.
	if (age>16) {
		System.out.println("can drive");
	}
	else {
		System.out.println("cannot drive");
	}

	}
}
