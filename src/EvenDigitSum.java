public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int cacheNumber = number;
        int result = 0;
        if(number < 0){
            return -1;
        }

        while (cacheNumber > 0) {
            int lastDigit = cacheNumber % 10;
            if (lastDigit % 2 == 0) {
                result += lastDigit;
            }
            cacheNumber /= 10;
        }
        return result;
    }
}
