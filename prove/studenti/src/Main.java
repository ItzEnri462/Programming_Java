import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studente a = new Studente();
        Studente b = new Studente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire i dati del primo studente (nome, cognome, altezza, eta, peso):");
        a.nome = sc.next();
        a.cognome = sc.next();
        a.altezza = sc.nextDouble();
        a.eta = sc.nextInt();
        a.peso = sc.nextDouble();

        System.out.println("Inserire i dati del secondo studente (nome, cognome, altezza, eta, peso):");
        b.nome = sc.next();
        b.cognome = sc.next();
        b.altezza = sc.nextDouble();
        b.eta = sc.nextInt();
        b.peso = sc.nextDouble();

        int continua;
        do {
            System.out.println("Inserire lo studente di cui vuoi controllare BMI o caratteristiche");
            int sceltaStudente = sc.nextInt();
            if (sceltaStudente == 1) {
                System.out.println("digitare 1 se si vuole controllare il BMI, 2 per gli altri dati");
                int sceltaControllo = sc.nextInt();
                if (sceltaControllo == 1)
                    System.out.println(a.calcolaIndice());
                else if (sceltaControllo == 2)
                    System.out.println(a.toString());
                else
                    System.out.println("Scelta non disponibile");
            } else if (sceltaStudente == 2) {
                System.out.println("digitare 1 se si vuole controllare il BMI, 2 per gli altri dati");
                int sceltaControllo = sc.nextInt();
                if (sceltaControllo == 1)
                    System.out.println(b.calcolaIndice());
                else if (sceltaControllo == 2)
                    System.out.println(b.toString());
                else
                    System.out.println("Scelta non disponibile");
            } else
                System.out.println("Lo studente selezionato non esiste");
            System.out.println("Vuoi continuare a fare controlli?\n Si -> 1\n No -> tutto il resto");
            continua = sc.nextInt();
        } while (continua == 1);

    }
}