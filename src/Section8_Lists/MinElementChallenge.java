package Section8_Lists;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Write number of integers requested: ");
        int sizeOfArray = sc.nextInt();
        sc.nextLine();
        System.out.println(findMin(readIntegers(sizeOfArray)));
    }

    private static int[] readIntegers(int count) {
        int[] resultArray = new int[count];

        System.out.println("Lets prepare the Array of " + count + " numbers.");

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            resultArray[i] = sc.nextInt();
        }
        return resultArray;
    }

    private static int findMin(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        System.out.println("Minium value = " + result);
        return result;
    }
}
