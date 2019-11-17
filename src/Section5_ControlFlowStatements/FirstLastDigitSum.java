package Section5_ControlFlowStatements;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        int cacheNumber = number;
        int firstDigit = 0;

        if(number < 0 ){
            return  -1;
        }

        while(cacheNumber > 0){
            firstDigit = cacheNumber % 10;
            cacheNumber /= 10;
        }

        return  (number % 10) + firstDigit;
    }
}
