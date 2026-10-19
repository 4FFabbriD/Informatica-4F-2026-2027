package distrib.passo01;

import java.util.ArrayList;
import java.util.List;

public class Distributore implements InterfacciaDistributore {
    private List<Slot> slotDisponibili;
    private GestoreCassa cassa;

    public Distributore() {
        this.slotDisponibili = new ArrayList<>();
        this.cassa = new GestoreCassa();
    }

    public void aggiungiSlot(Slot slot) {
    }

    @Override
    public void inserisciMoneta(Monetina moneta) {
    }

    @Override
    public Prodotto selezionaProdotto(String codiceSlot) {
        return null;
    }

    @Override
    public double annullaOperazione() {
        return 0.0;
    }

    @Override
    public double getCreditoInserito() {
        return 0.0;
    }

    @Override
    public List<Slot> getElencoProdotti() {
        return null;
    }
}