package distrib.passo01;

public class Slot {
    private String codiceSlot; // es. "A1", "A2"
    private Prodotto prodotto;
    private int quantita;

    public Slot(String codiceSlot, Prodotto prodotto, int quantitaIniziale) {
        this.codiceSlot = codiceSlot;
        this.prodotto = prodotto;
        this.quantita = quantitaIniziale;
    }

    public boolean eDisponibile() {
        return false;
    }

    public Prodotto eroga() {
        return null;
    }

    public void ricarica(int quantita) {
    }

    public String getCodiceSlot() {
        return "";
    }

    public Prodotto getProdotto() {
        return null;
    }

    public int getQuantita() {
        return 0;
    }
}