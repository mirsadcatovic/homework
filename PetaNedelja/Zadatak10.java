import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        //Za zadati niz String-ova ispisati da li niz sadrži iste Stringove dva ili više puta.
        int n, i, j, brojac = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza.");
        n = in.nextInt();
        while (n <= 0) {
            System.out.println("Unesite broj veci od 0.");
            n = in.nextInt();
        }
        String[] niz = new String[n];

        System.out.println("Unesite elemente niza.");
        for (i = 0; i < n; i++) {
            niz[i] = in.next();
        }
        for (i = 0; i < n; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println("");

        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (niz[i].equals(niz[j])) {
                    brojac++;
                }
            }
        }
        if (brojac != 0) {
            System.out.print("U zadatom nizu postoje elmenti koji se ponavljaju dva ili vise puta.");
        }else {
            System.out.print("U zadatom nizu ne postoje elmenti koji se ponavljaju dva ili vise puta.");
        }
    }
}