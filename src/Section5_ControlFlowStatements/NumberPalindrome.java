package Section5_ControlFlowStatements;

public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int cacheNumber= number;

        while(Math.abs(cacheNumber) > 0){
            reverse = (reverse * 10) + (cacheNumber % 10);
            cacheNumber /= 10;
        }

        return reverse == number;
    }
}
