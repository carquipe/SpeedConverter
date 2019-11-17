package Section5_ControlFlowStatements;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                int insertedInt = scanner.nextInt();
                sum += insertedInt;
                count++;
            } else {
                long avg = Math.round((double) sum/count);
                System.out.printf("SUM = %s AVG = %s", sum, avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
