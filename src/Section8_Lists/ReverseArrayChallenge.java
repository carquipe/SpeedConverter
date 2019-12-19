package Section8_Lists;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(input));
        reverse(input);
        System.out.println(Arrays.toString(input));
    }

    private static void reverse(int[] input) {
        for (int i = 0; i < input.length / 2; i++) {
            int tempValue = input[input.length - (i + 1)];
            input[input.length - (i + 1)] = input[i];
            input[i] = tempValue;
        }
    }


}
