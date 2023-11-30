package ESERCIZIO1;

public class Dipendente {
    //Attributo statico
    static double stipendioBase = 1000.0;

    //Attributi non statici e privati
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        double stipendioBase = dipendente.getStipendio();
        double importoOrarioStraordinario = dipendente.getImportoOrarioStraordinario();

        return stipendioBase + (oreStraordinario * importoOrarioStraordinario);
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + this.matricola);
        System.out.println("Stipendio: " + this.stipendio);
        System.out.println("Importo Orario Straordinario: " + this.importoOrarioStraordinario);
        System.out.println("Livello: " + this.livello);
        System.out.println("Dipartimento: " + this.dipartimento);

    }

    public Livello promuovi() {
        switch (livello) {
            case OPERAIO:
                livello = Livello.IMPIEGATO;
                stipendio = stipendioBase * 1.2;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                stipendio = stipendioBase * 1.5;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                stipendio = stipendioBase * 2;
                break;
            case DIRIGENTE:
                System.out.println("Il dipendente è già un dirigente. Nessuna promozione possibile.");
                break;
        }
        return livello;
    }
}
