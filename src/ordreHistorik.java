import java.util.ArrayList;
import java.util.List;  //Gør at vi kan bruge add(), remove() og get().

public class ordreHistorik {
    private List<Ordre> ordreHistorik;    //Vi laver en liste der gemmer alle ordrer.

    //Konstruktør
    public ordreHistorik() {
        ordreHistorik = new ArrayList<>();
    }

    //Metode som skal tilføje ordre til ordrehistorikken.
    public void tilføjOrdrer(Ordre ordre) {
        ordreHistorik.add(ordre);
    }

    //Metode til at hente ordrehistorikken.
    public List<Ordre> getOrdreHistorik() {
        return ordreHistorik;
    }

    //Metode til at beregne den samlede omsætning ud fra alle ordrer.
    public double beregnOmsætning() {
        double omsætning = 0.0;  //variabel der opbevarer den samlede omsætning

        //Gennemgår ordrehistorikken og lægger den samlede pris til omsætningen
        for (Ordre ordre : ordreHistorik) {
        //    omsætning += ordre.getTotalPris();
        }
        return omsætning;
    }

}
