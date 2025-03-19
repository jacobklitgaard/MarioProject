import java.util.Scanner;

public class MARIOResturant {
    private OrdreListe Ordreliste = new OrdreListe();
    private ordreHistorik Ordrehistorik = new ordreHistorik();
    private KundeHistorik KundeHistorik = new KundeHistorik();

    public static void main(String[] args) {
        new Resturant().run();


    }
    Scanner scanner = new Scanner(System.in);
    public void run () {
        while (true){
            System.out.println(" MARIOS PIZZA");
            System.out.printf(" 1. Vis Menu");
            System.out.println(" 2. Bestilt Pizza");
            System.out.println(" 3. Vis ordrehistorik");
            System.out.println(" 4. se kundehistorik");
            System.out.println(" 5. afslut");
            System.out.println("vælg en af de overstående");
            int valg = scanner.nextInt();
            scanner.nextInt();

            switch (valg){
                case 1:
                    VisMenu();
                    break;
                case 2:
                    BestiltPizza();
                    break;
                case 3:
                    Ordreliste();
                    break;
                case 4:
                    VisKundehistorik();
                    break;
                case 5:
                    afslut();

                    System.out.println("lukker Programmet");



            }

        }
    }

    private void VisMenu() {

    }

    private void BestiltPizza() {
    }

    private void Ordreliste() {
    }

    private void VisKundehistorik() {
    }

    private void afslut() {
    }

}
