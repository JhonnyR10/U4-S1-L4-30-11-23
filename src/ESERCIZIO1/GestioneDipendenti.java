package ESERCIZIO1;

public class GestioneDipendenti {
    public static void main(String[] args) {

        Dipendente operaio1 = new Dipendente(1, 1000, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente(2, 1000, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente impiegato = new Dipendente(3, 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente = new Dipendente(4, 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

        operaio1.promuovi();
        impiegato.promuovi();

        System.out.println("Stato dei dipendenti dopo le promozioni:");
        operaio1.stampaDatiDipendente();
        operaio2.stampaDatiDipendente();
        impiegato.stampaDatiDipendente();
        dirigente.stampaDatiDipendente();


        int oreStraordinario = 5;
        double sommaStipendi = Dipendente.calcolaPaga(operaio1, oreStraordinario) +
                Dipendente.calcolaPaga(operaio2, oreStraordinario) +
                Dipendente.calcolaPaga(impiegato, oreStraordinario) +
                Dipendente.calcolaPaga(dirigente, oreStraordinario);


        System.out.println("Somma degli stipendi compresi 5 ore di straordinario: " + sommaStipendi);
    }
}
