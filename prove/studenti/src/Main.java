import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studente a = new Studente();
        Studente b = new Studente();
        System.out.println("Inserire i dati del primo studente in ordine: \n  1. nome \n  2. cognome \n  3. altezza \n  4. eta \n 5.  peso");
        Scanner sc = new Scanner(System.in);
        a.nome = sc.next();
        a.cognome = sc.next();
        a.altezza = sc.nextFloat();
        a.eta = sc.nextInt();
        a.peso = sc.nextFloat();

        System.out.println("Inserire i dati del secondo studente in ordine: \n  1. nome \n  2. cognome \n  3. altezza \n  4. eta \n 5.  peso");
        b.nome = sc.next();
        b.cognome = sc.next();
        b.altezza = sc.nextFloat();
        b.eta = sc.nextInt();
        b.peso = sc.nextFloat();

    }
}