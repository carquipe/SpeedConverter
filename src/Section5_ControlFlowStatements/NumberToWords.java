package Section5_ControlFlowStatements;

public class NumberToWords {

    public static void main(String[] args) {
        //System.out.println(getDigitCount(123));
        //System.out.println(getDigitCount(-12));
        //System.out.println(getDigitCount(5200));
        //System.out.println(getDigitCount(0));

        //System.out.println(reverse(-121));
        //System.out.println(reverse(1212));
        //System.out.println(reverse(1234));
        //System.out.println(reverse(100));

        //numberToWords(123);
        numberToWords(1010);
        //numberToWords(0);
        //numberToWords(1000);
        //numberToWords(-12);
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        int reverseCount = getDigitCount(reverseNumber);

        while(reverseNumber >= 0){

            switch (reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reverseNumber /= 10;
            if(reverseNumber == 0){
                break;
            }
        }

        for(int numberCount = getDigitCount(number); numberCount > reverseCount; numberCount--){
            System.out.println("Zero");
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        int cacheNumber= number;

        while(Math.abs(cacheNumber) > 0){
            reverse = (reverse * 10) + (cacheNumber % 10);
            cacheNumber /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        int digits = 0;

        if(number < 0) {
            return -1;
        }

        do{
            digits++;
            number /= 10;
        } while (number > 0);

        return digits;
    }
}
