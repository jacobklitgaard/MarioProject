public class KundeHistorik {
    private String[] telefonnumre = new String[1000];
    private int[] antalBestillinger = new int[1000];
    private int antalKunder = 0;

    public void tilfojBestilling(String telefonnummer) {
        int index = findKunde(telefonnummer);

        if (index == -1) { // Kunden findes ikke
            telefonnumre[antalKunder] = telefonnummer;
            antalBestillinger[antalKunder] = 1;
            antalKunder++;
        } else { // Kunden findes
            antalBestillinger[index]++;
        }
    }
    private int findKunde(String telefonnummer) {
        for (int i = 0; i < antalKunder; i++) {
            if (telefonnumre[i].equals(telefonnummer)) {
                return i;
            }
        }
        return -1; // Kunden findes ikke
    }

    // Hent antal bestillinger for en kunde
    public int hentAntalBestillinger(String telefonnummer) {
        int index = findKunde(telefonnummer);
        return (index != -1) ? antalBestillinger[index] : 0;
    }
}