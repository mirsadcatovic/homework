import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*Napisati program koji učita dva niza i kao rezultat kreira treći niz koji predstavlja presek učitanih nizova.
Ispisati rezultat u formatu ‘( element * element * element * … element).’
         */
        int n, m, i, j, k, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Koliko elemata zelite da ima prvi niz?");
        n = in.nextInt();
        while (n <= 0) {
            System.out.println("Unesite broj veci od 0");
            n = in.nextInt();
        }
        int[] niz1 = new int[n];

        System.out.println("Unesite elemente prvog niza.");
        for (i = 0; i < n; i++) {
            niz1[i] = in.nextInt();
        }
        System.out.print("Prvi niz ima elemente ( ");
        for (i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(niz1[i] + "");
            } else {
                System.out.print(niz1[i] + " * ");
            }
        }
        System.out.print(")");

        System.out.println("");

        System.out.println("Koliko elemata zelite da ima drugi niz?");
        m = in.nextInt();
        while (m <= 0) {
            System.out.println("Unesite broj veci od 0");
            m = in.nextInt();
        }
        int[] niz2 = new int[m];

        System.out.println("Unesite elemente drugog niza.");
        for (j = 0; j < m; j++) {
            niz2[j] = in.nextInt();
        }
        System.out.print("Drugi niz ima elemente ( ");
        for (j = 0; j < m; j++) {
            if (j == m - 1) {
                System.out.print(niz2[j] + "");
            } else {
                System.out.print(niz2[j] + " * ");
            }
        }
        System.out.print(")");

        System.out.println("");

        System.out.println("Zajednicki elementi prvog i drugo niza su.");

        if (m < n) {
            int[] niz3 = new int[m];
            for (i = 0, k = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    if (niz1[i] == niz2[j]) {
                        niz3[k] = niz1[i];
                        k = k + 1;
                    }
                }
            }

            System.out.print("( ");
            int[] konacan;
            konacan = niz3;
            for (z = 0; z < k; z++) {
                if (z == k - 1) {
                    System.out.print(konacan[z] + "");
                } else {
                    System.out.print(konacan[z] + " * ");
                }
            }
            System.out.print(")");
        }

        if (m > n) {
            int[] niz3 = new int[n];
            for (i = 0, k = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    if (niz1[i] == niz2[j]) {
                        niz3[k] = niz1[i];
                        k = k + 1;
                    }
                }
            }

            System.out.print("( ");
            int[] konacan;
            konacan = niz3;
            for (z = 0; z < k; z++) {
                if (z == k - 1) {
                    System.out.print(konacan[z] + "");
                } else {
                    System.out.print(konacan[z] + " * ");
                }
            }
            System.out.print(")");
        }
    }
}