public class Studente {
    String nome;
    String cognome;
    double altezza;
    int eta;
    double peso;

    public Studente() {
        this.nome = " ";
        this.cognome = " ";
        this.eta = 0;
        this.altezza = 0.0;
        this.peso = 0;
    }

    public Studente(String nome, String cognome, int eta, double altezza, double peso) {
        this.nome = nome;
        this.cognome = cognome;
        if (this.eta <= 5)
            eta = 5;
        this.eta = eta;
        if (this.altezza <= 0.80)
            altezza = (double) 0.80;
        this.altezza = altezza;
        if (this.peso <= 15)
            peso = 15.0;
        this.peso = peso;
    }
    public String toString () {
        String s = "I dati dello studente sono: ";
        s += this.nome + " " + this.cognome + ", " + this.eta + " anni, " + this.altezza + "m," + this.peso + "kg.";
        return s;
    }

    public String calcolaIndice () {
        //bmi = peso / h^2
        double bmi = peso / (altezza * altezza);
        if (bmi < 18.5)
            return "Lo studente è sottopeso";
        else if (bmi >= 18.5 && bmi < 25)
            return "Lo studente è normopeso";
        else if (bmi >=25 && bmi < 30)
            return "Lo studente è sovrappeso";
        else
            return "Lo studente è obeso";
    }
}
