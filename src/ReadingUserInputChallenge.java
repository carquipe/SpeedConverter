import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int numbersCollected = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (numbersCollected < 10){
            System.out.println("Please enter number #" + (numbersCollected + 1));
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                numbersCollected++;
            } else  {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("Sum of Values = " + sum);
        scanner.close();
    }
}
