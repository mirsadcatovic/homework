import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        /*A) Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza, zadržavajući redosled nenultih
elemenata.
B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz, već modifikovati postojeći.
Primer: Ulazni niz -> 1 0 2 25 0 6, Izlaz -> 1 2 25 6 0 0
         */
        int n, i, j = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza.");
        n = in.nextInt();
        int[] niz1 = new int[n];
        int[] niz2 = new int[n];

        System.out.println("Unesite elemente niza.");
        for (i = 0; i < n; i++) {
            niz1[i] = in.nextInt();
        }
        System.out.println("Elementi unetog niza su: ");
        for (i = 0; i < n; i++) {
            System.out.print(niz1[i] + " ");
        }

        for (i = 0; i < n; i++) {
            if (niz1[i] != 0) {
                niz2[j] = niz1[i];
                j++;
            }
        }
        for (i = 0; i < n; i++) {
            if (niz1[i] == 0) {
                niz2[j] = niz1[i];
                j++;
            }
        }
        System.out.println("");
        System.out.println("Preuredjeni niz izgleda ovako.");
        for (j = 0; j < n; j++) {
            System.out.print(niz2[j] + " ");
        }
    }
}