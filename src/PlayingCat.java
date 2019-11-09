public class PlayingCat {
    public static void main (String[] args){
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        // my preferred method (commented out)
    /*
    int lowTemp = 25, highTemp = 35;
    if (summer) {
        highTemp = 45;
    }
    return temperature >= lowTemp && temperature <= highTemp;
    */

        // the other method
        return temperature >= 25 && (temperature <= (summer ? 45 : 35));
    }
}
