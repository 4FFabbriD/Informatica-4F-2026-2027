package distrib.passo01;

public enum Monetina {
    DIECI_CENT(0.10),
    VENTI_CENT(0.20),
    CINQUANTA_CENT(0.50),
    UN_EURO(1.00),
    DUE_EURO(2.00);

    private final double valore;

    Monetina(double valore) {
        this.valore = valore;
    }

    public double getValore() {
        return valore;
    }
}