public class Studente {
    String nome;
    String cognome;
    float altezza;
    int eta;
    float peso;

    public Studente(String nome, String cognome, int eta, float altezza, float peso) {
        this.nome = nome;
        this.cognome = cognome;
        if (this.eta <= 5)
            eta = 5;
        this.eta = eta;
        this.altezza = altezza;
        this.peso = peso;
    }
    public String toString () {
        String s = "I dati dello studente sono: ";
        s += this.nome + ", " + this.cognome + ", " + this.eta + ", " + this.altezza + ".";
        return s;
    }

    public double calcolaIndice () {
        //bmi = peso / h * 2
        double bmi = peso / (altezza * 2);
        return bmi;
    }
}
