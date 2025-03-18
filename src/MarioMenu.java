public enum MarioMenu {
    Vesuvio(1, 20.00),
    Amerikaner(2, 45.00),
    Cacciatore(3, 55.00),
    Carbona(4, 60.00),
    Dennis(5, 90.00),
    Bertil(6, 90.00),
    Silvia(7, 90.00),
    Victoria(8, 90.00),
    Toronto(9, 90.00),
    Capricciose(10, 90.00),
    Hawaii(11, 90.00),
    Le_Blissola(12, 90.00),
    Venicia(13, 90.00),
    Mafia(14, 90.00);

    int BrugerValg;
    double Pris;

    MarioMenu(int BrugerValg, double Pris) {
        this.BrugerValg = BrugerValg;
        this.Pris = Pris;
    }

    public int getBrugerValg() {
        return BrugerValg;
    }

    public double getPris() {
        return Pris;
    }
}
