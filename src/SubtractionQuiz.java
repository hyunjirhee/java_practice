import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int magicNumber = (int)(Math.random()*100);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your guess: ");
        int inputNum = scanner.nextInt();

        while (inputNum != magicNumber) {
            if (inputNum > magicNumber) {
                System.out.println("Your guess is too high.");
                System.out.printf("Enter your guess: ");
                inputNum = scanner.nextInt();
            }
            else{
                    System.out.println("Your guess is too low.");
                    System.out.printf("Enter your guess: ");
                    inputNum = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.printf("Yes, the number is %d.", magicNumber);
    }
}
