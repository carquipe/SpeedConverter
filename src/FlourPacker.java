public class FlourPacker {
    public static void main(String[] args) {
         System.out.println(canPack(1,0,4));
         System.out.println(canPack(1,0,5));
         System.out.println(canPack(0,5,4));
         System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        final int BIG_AMOUNT = 5;
        final int SMALL_AMOUNT = 1;

        int sum = (bigCount * BIG_AMOUNT) + (smallCount * SMALL_AMOUNT);

        if(bigCount < 0 || smallCount < 0 || goal < 0 || sum < goal){
            return false;
        } else if ( sum == goal) {
            return true;
        } else {
            return goal % BIG_AMOUNT <= (smallCount * SMALL_AMOUNT);
        }
    }
}
