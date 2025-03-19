import java.util.ArrayList;
import java.util.List;

public class OrdrerAfslutning {
    private int id; // int fordi id'et kun er af hele tal. Samlæg med Sebastians som bruger telefonnumre til kundehistorik.
    private boolean erBetalt;
    private boolean erAfhentet;

    public OrdrerAfslutning(int id) {
        this.id = id;
        this.erBetalt = false; //Når en ordre oprettes, er den som standard ikke betalt.
        this.erAfhentet = false; //Når en ordre oprettes, er den som standard ikke afhentet.
    }

    public void Betalt() {
        this.erBetalt = true; //Sætter erBetalt til true, hvilket betyder, at ordren nu er betalt.
    }

    public void Afhentet() {
        this.erAfhentet = true; //Sætter erAfhentet til true, hvilket betyder, at ordren nu er afhentet.
    }

    public boolean Afsluttet() {
        return erBetalt && erAfhentet; //Returnerer true, hvis både erBetalt og erAfhentet er true.
    }

    public int hentId() { //henter ordrens ID.
        return id;
    }
}

class ordreSystem { //Gennemgår de aktive ordre i systemet.
    private List<OrdrerAfslutning> aktiveOrdrer; //Private så kun OrderSystem-klassen har kontrol over, hvordan ordrer tilføjes eller fjernes.

    public ordreSystem() { //Constructer til ordreSystem-klassen.
        this.aktiveOrdrer = new ArrayList<>(); // En ny tom liste til ordrer.
    }

    public void tilføjOrdre(OrdrerAfslutning ordrer) {
        aktiveOrdrer.add(ordrer); //Den nyligt modtaget ordre tilføjes til listen af aktive ordrer.
        //Når afsluttes tilføjes til ordrehistorik.
    }

    public void markerSomBetalt(int ordreId) { //Denne metode markerer en ordre som betalt baseret på dens ID.
        for (OrdrerAfslutning ordrer : aktiveOrdrer) { //En for-each-løkke, der løber gennem hver ordre i aktiveOrdrer-listen.
            if (ordrer.hentId() == ordreId) { //Her tjekkes, om ordre-ID'et for den aktuelle ordre (ordrer.hentId()) matcher det ID, der er sendt som parameter (ordreId).
                ordrer.Betalt(); //Hvis ID'erne matcher, kaldes markerSomBetalt()-metoden på den pågældende ordre. Dette sætter erBetalt til true for ordren.
                break; //Når ordren er fundet og markeret som betalt, stopper løkken, da der ikke er behov for at fortsætte.
            }

        }
    }

    public void markerSomAfhentet(int ordrerId) { //Denne metode markerer en ordre som afhentet baseret på dens ID.
        for (OrdrerAfslutning ordrer : aktiveOrdrer) { // En for-each-løkke, der løber gennem hver ordre i activeOrders-listen.
            if (ordrer.hentId() == ordrerId) { // //Her tjekkes, om ordre-ID'et for den aktuelle ordre (ordrer.hentId()) matcher det ID, der er sendt som parameter (ordreId).
                ordrer.Afhentet(); //Hvis ID'erne matcher, kaldes markerSomAfhentet()-metoden på ordren. Dette sætter Afhentet til true.
                if (ordrer.Afsluttet()) { //Tjekker, om ordren er klar til at blive sat som afsluttet. Dette sker, hvis både Betalt og Afhentet er true (implementeret i Ordrer-klassen).
                    aktiveOrdrer.remove(ordrer); //Hvis ordren er klar til at blive fjernet, fjernes den fra activeOrders-listen.
                }
                break;
            }
        }
    }

    public void findAktiveOrdrer() { //Denne metode viser alle de aktive ordrer i systemet.
        for (OrdrerAfslutning order : aktiveOrdrer) { //Løber gennem hver ordre i aktiveOrdrer-listen.
            System.out.println("Ordren med ID: " + order.hentId() + " er stadig aktiv.");
        }
    }

    public class Main { //Samles i én med de andre.
        public static void main(String[] args) {
            ordreSystem system = new ordreSystem(); //Her oprettes en ny instans af ordreSystem. Dette er det centrale objekt, der håndterer alle ordrer i systemet.

            OrdrerAfslutning order1 = new OrdrerAfslutning(1); //Constructor i Ordrer-klassen initialiserer ordren med Betalt = false og Afhentet = false.
            OrdrerAfslutning order2 = new OrdrerAfslutning(2);

        /*Tilføjer order1 til ordreSystem. Dette gøres ved at kalde tilføjOrdre-metoden på system-objektet.
        Ligeledes tilføjes ordren til aktive-listen inden i metoden tilføjOrdrer.*/
            system.tilføjOrdre(order1);
            system.tilføjOrdre(order2);

            system.markerSomBetalt(1);
        /*Marker ordren med ID 1 som betalt.
        Systemet løber gennem aktiveOrdrer-listen for at finde ordren med ID 1.
        Når ordren er fundet, kaldes erBetalt()-metoden på ordren, hvilket sætter Betalt til true.*/
            system.markerSomAfhentet(1);
            /* Marker ordren med ID 1 som afhentet.
            Systemet løber gennem aktiveOrdre-listen for at finde ordren med ID 1.
            Når ordren er fundet, kaldes markerSomAfhentet()-metoden på ordren, hvilket sætter Afhentet til true.
            Derefter tjekkes, om ordren er klar til at blive fjernet (dvs. om både Betalt og Afhentet er true).*/
        }

    }
}


