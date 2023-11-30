package ESERCIZIO1;


public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(1111, Dipartimento.PRODUZIONE);
        double stipendioMensile = Dipendente.calcolaPaga(dipendente1);
        System.out.println("Stipendio mensile: " + stipendioMensile);
        dipendente1.stampaDatiDipendente();
    }
}
