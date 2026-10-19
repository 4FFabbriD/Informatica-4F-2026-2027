package distrib.passo01;

import java.util.List;

public class GestoreCassa {
    private double creditoAttuale;
    private double cassaTotale;

    public GestoreCassa() {
        this.creditoAttuale = 0.0;
        this.cassaTotale = 0.0;
    }

    public void inserisciMoneta(Monetina moneta) {
    }

    public double getCreditoAttuale() {
        return 0.0;
    }

    public boolean haCreditoSufficiente(double prezzo) {
        return false;
    }

    public double erogaResto() {
        return 0.0;
    }

    public void incassa(double importo) {
    }
}