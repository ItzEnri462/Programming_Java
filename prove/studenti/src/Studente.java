public class Studente {
    String nome;
    String cognome;
    float altezza;
    int eta;
    public Studente(String name, String surname, int age, float height)  {
        nome=name;
        cognome=surname;
        eta=age;
        altezza=height;
    }
    public String toString (){
        String s = "I dati dello studente sono: ";
        s += this.nome + ", " + this.cognome + ", " + this.eta + ", " + this.altezza + ".";
        return s;
    }
}
