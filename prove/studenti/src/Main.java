import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Studente s = new Studente("Davide", "Rossi", 17, (float) 1.72);
        System.out.println(s.nome);
    }
}