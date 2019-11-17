public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int number, int number2){
        if (number >= 10 && number <= 99 && number2 >= 10 && number2 <= 99){
            int cacheNumber = number;
            while (cacheNumber > 0){

                int cacheNumber2 = number2;
                while (cacheNumber2 > 0){
                    if(cacheNumber % 10 == cacheNumber2 % 10){
                        return true;
                    }
                    cacheNumber2 /= 10;
                }
                cacheNumber /= 10;
            }
        }
        return  false;
    }
}
