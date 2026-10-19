package distrib.passo01;

import java.util.List;

public interface InterfacciaDistributore {
    void inserisciMoneta(Monetina moneta);
    Prodotto selezionaProdotto(String codiceSlot);
    double annullaOperazione();
    double getCreditoInserito();
    List<Slot> getElencoProdotti();
}