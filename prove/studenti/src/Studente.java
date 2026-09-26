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
            return "Valore non valido";
    }
}
