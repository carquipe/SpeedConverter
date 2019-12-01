package Section7_OOP2;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(boolean isDuplexPrinter, int tonerLevel) {
        this.isDuplexPrinter = isDuplexPrinter;
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
    }

    public void fillUpToner(int charge){
        if(charge > 0){
            tonerLevel = (tonerLevel + charge) > 100 ? 100 : tonerLevel + charge;
        } else {
            System.out.println("Invalid value of charge");
        }
    }

    public void printPage(){
        if( tonerLevel > 0) {
            pagesPrinted += isDuplexPrinter ? 2 : 1;
            tonerLevel -= isDuplexPrinter ? 2 : 1;
            System.out.println("Printing....");
        } else {
            System.out.println("Cant't print, not enough toner level");
        }
        System.out.println("Current Toner Level: " + tonerLevel + " Current Pages Printed:" + pagesPrinted);
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
