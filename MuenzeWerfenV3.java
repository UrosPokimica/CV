import java.util.Random;
import java.util.Scanner;

public class MuenzeWerfenV3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        int kopf = 0;
        int zahl = 0;
        boolean zufrieden;
        int a = 0;

        do {
            do {
                System.out.println("Wie viel mal sollen wir münze werfen (INSGESAMT ungerade Zahl 1-10?");
                n = sc.nextInt();
            } while ((n > 10 || n < 1) || ((a + n) % 2 == 0));
            a = a + n;
            for (int i = 0; i < n; i++) {
                boolean wurf = r.nextBoolean();
                if (wurf) {
                    System.out.println("Werfe Münze..Kopf!");
                    kopf++;
                } else {
                    System.out.println("Werfe Münze..Zahl!");
                    zahl++;
                }
            }
            System.out.println("Summe Kopf: " + kopf);
            System.out.println("Summe Zahl: " + zahl);
            System.out.println("Bist du mit Ergebnis zufrieden?");
            zufrieden = sc.nextBoolean();
        } while (!zufrieden);
        if (kopf > zahl) {
            System.out.println("Ich bekomme das Ticket. :D ");
        } else {
            System.out.println("Stefan bekomme das Ticket. :( ");
        }
    }
}
