import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Collections;


    //Class med arrayliste hvor ordrene gemmes
    class Ordre {
        LocalTime tid;
        String ordre;

        public Ordre (LocalTime tid, String ordre) {
            this.tid = tid;
            this.ordre = ordre;
        }

        @Override
        public String toString () {
            return tid + ordre;
        }
    }
public class OrdreListe {
        private final ArrayList<Ordre> ordreListe = new ArrayList<>();
        // private ArrayList<LocalTime> ordreLevering = new ArrayList<>();

        //metode til at vise ordreliste
        public void showOrdreListe () {

            for (int i = 0; i < ordreListe.size(); i++) {
                System.out.println(ordreListe.get(i));
            }
        }
        //metode til at tilføje ordre til ordrelisten
        public void addToOrdreListe (LocalTime tid, String ordre) {
            ordreListe.add(new Ordre(tid, ordre));
        }
        //public void addToOrdreLevering (LocalTime tid) {
        //    ordreLevering.add(tid);
        //}
        //metode til at fjerne ordre fra ordrelisten
        public void removeFromOrdreListe (String string) {
            ordreListe.remove(string);
        }
        public void sortereOrdreListe () {

        }
    }

    class TestMain {
        public static void main (String[] args) {

        }
    }
class OrdreListeMenu {
    //variabler til user input
    String userInput;
    int userInt;
    //boolean til while loopet
    boolean running = true;

    public void ordreMenu() {
        while (running) {
            System.out.println("Nuværende ordre: ");

            System.out.println("Ordre Menu:");
            System.out.println("    1. Tilføj Ordre");
            System.out.println("    2. Fjern Ordre");
            System.out.println("    3. Vis nuværende ordre");
            System.out.println("    4. Gå tilbage");
            System.out.println("Skriv et nr fra 1-4 og tryk enter: ");

            //Gemmer bruger input i en variable så den kan bruges i switch casen
            userInt = handleUserInt();
            //sætter switch case op med muligheder
            switch (userInt) {
                case 1:
                    System.out.println("Skriv de retter der skal tilføjes til ordren:");
                    break;
                case 2:
                    System.out.println("fjern ordre");
                    break;
                case 3:
                    System.out.println("Nuværende ordre: ");
                    break;
                case 4:
                    System.out.println("Går tilbage!");
                    running = false;
                    break;

                default:
                    System.out.println("Fejl, skriv et nr fra 1-4 og tryk enter!");
            }
        }
    }

    //metode til at håndtere String input i menuen. (userinput skal ikke gentages)
    public static String handleUserString() {
        Scanner scan = new Scanner(System.in);
        String userInput;
        return userInput = scan.nextLine();
    }

    //metode til at håndtere Int input i menuen. (til Switch case)
    public static int handleUserInt() {
        Scanner scan = new Scanner(System.in);
        int userInput;
        return userInput = scan.nextInt();
    }
}
