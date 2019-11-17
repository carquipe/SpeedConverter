public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int y = 1; y <= number; y++) {
                for (int x = 1; x <= number; x++) {
                    if (x == 1 || y == 1 || x == y || y == (number - x + 1) || x == number || y == number) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
