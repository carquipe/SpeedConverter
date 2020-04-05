import java.util.ArrayList;

public class Main {
    static ArrayList<Album> collections = new ArrayList<Album>();

    public static void main(String[] args) {
        Bank bank = new Bank("La Caixa");

        bank.addBranch("VLC");
        bank.addCustomer("VLC", "Carlos", 1000.00);
        bank.addCustomer("VLC", "Joan", 500.00);
        bank.addCustomer("VLC", "Pepe", 3500.00);
        bank.addCustomer("VLC", "Maria", 10000.00);

        bank.addBranch("MAD");
        bank.addCustomer("MAD", "Josefa", 100.00);
        bank.addCustomer("MAD", "Julio", 550.00);

        bank.addBranchTransaction("MAD", "Josefa", 49448.00);
        bank.addBranchTransaction("BCN", "Pepe", 3373737.00);
        bank.addBranchTransaction("MAD", "Mike", 737373.88);

        bank.listCustomers("VLC", false);
        bank.listCustomers("MAD", true);



        Album albumMelendi = new Album("Melendi","Euromillon");
        albumMelendi.addSong("Mientras no Cueste Trabajo",145);
        albumMelendi.addSong("Hablando en plata",234);
        albumMelendi.addSong("Milindri",345);
        Album albumECDL = new Album("Volvera","El Canto del Loco");
        albumECDL.addSong("Jose",343);
        albumECDL.addSong("Princesas",210);

        collections.add(albumMelendi);
        collections.add(albumECDL);



    }
}
