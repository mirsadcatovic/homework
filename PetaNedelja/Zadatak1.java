import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*A) Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.
B) Modifikovati program tako da se postupak pod a) ponavlja i to tako da pre svakog unosa korisnik vidi
pitanje da li želi da unese još jedan broj. Ako je odgovor 'da' treba izbrojati cifre deljive sa 3, a ukoliko je 'ne'
treba završiti program.
C) Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive
         */
        int broj, cifra, brojac = 0, zakljucati;
        String unosReci;
        Scanner in = new Scanner(System.in);

        System.out.println("Molimo Vas unesite broj.");
        broj = in.nextInt();
        zakljucati = broj;

        while (broj != 0) {
            cifra = broj % 10;
            if (cifra % 3 == 0) {
                brojac++;
            }
            broj /= 10;
        }
        System.out.println("Postoji " + brojac + " cifara u broju " + zakljucati + " koje su deljive sa 3.");
        brojac = 0;
        System.out.println("Da li zelite da unesete novi broj?");
        unosReci = in.next();

        while (!unosReci.equalsIgnoreCase("da") && !unosReci.equalsIgnoreCase("ne")) {
            System.out.println("Mozete uneti samo da ili ne.");
            unosReci = in.next();
        }

        while (unosReci.equalsIgnoreCase("da")) {
            System.out.println("Molimo Vas unesite sledeci broj.");
            broj = in.nextInt();
            zakljucati = broj;

            while (broj != 0) {
                cifra = broj % 10;
                if (cifra % 3 == 0) {
                    brojac++;
                }
                broj /= 10;
            }
            System.out.println("Postoji " + brojac + " cifara u broju " + zakljucati + " koje su deljive sa 3.");
            brojac = 0;
            System.out.println("Da li zelite da unesete novi broj?");
            unosReci = in.next();

            while (!unosReci.equalsIgnoreCase("da") && !unosReci.equalsIgnoreCase("ne")) {
                System.out.println("Mozete uneti samo da ili ne.");
                unosReci = in.next();
            }
        }
        if (unosReci.equalsIgnoreCase("ne")) { // zavrsio bi se program i bez ovoga System.exit(1), ali kada mi da Process finished with exit code 1, onda znam da je korisnik ukucao ne.
            System.exit(1);
        }
    }
}