package Section5_ControlFlowStatements;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = first;

        if (first >= 10 && second >= 10) {

            if (first >= second) {
                divisor = second;
            }

            while (divisor > 0) {
                if (first % divisor == 0 && second % divisor == 0) {
                    return divisor;
                }
                divisor--;
            }
        }
        return -1;
    }
}
