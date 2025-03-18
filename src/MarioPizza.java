import javax.naming.ldap.ManageReferralControl;
import java.util.Scanner;

public class MarioPizza {
    public static void main(String[] args) {
        System.out.println("Marios Pizza Menu! ");
        Scanner scanner = new Scanner(System.in);
        for (MarioMenu Pizzaer : MarioMenu.values()){
            System.out.printf("Nr %d %S %f.2 Kr, Pizzaer.getBrugerValg(), Pizzaer.name(), Pizzaer.getPris()");
            System.out.println("Nr " + Pizzaer.getBrugerValg() + " " + Pizzaer.name() + " " + Pizzaer.getPris() + " Kr");
    }

        System.out.println("Indtast Nr på den pizza du kunne tænke dig!");
        int BrugerValg = scanner.nextInt();
        MarioMenu ValgtPizza = null;
        for (MarioMenu f : MarioMenu.values()) {
            if ()
        }


    }
}
