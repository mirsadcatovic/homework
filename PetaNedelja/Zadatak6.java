import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        /*Zadati su jedan niz celih brojeva, i jedan broj koji prestavlja ‘metu’. Napisati program koji vraća indekse dva
broja koja kada se saberu daju rezultat jednak unetoj ‘meti’.
Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje. Ne koristiti jedan element više puta
         */ //OBJASNIO LUKA
        int n, i,j, meta, suma, brojac = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza.");
        n = in.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza.");
        for (i = 0; i < n; i++) {
            niz[i] = in.nextInt();
        }

        System.out.println("Unesite metu.");
        meta = in.nextInt();

        aa:
        for (i = 0; i < n - 1; i++) {
            bb:
            for (j = i + 1; j < n; j++) {
                suma = niz[i] + niz[j];
                if (suma == meta) {
                    System.out.println("Brojevi sa indeksima  " + i + " i " + j + " trebaju da se saberu.");
                    System.out.println("To su brojevi "+niz[i]+" i "+niz[j]);
                    brojac++;
                    break aa;// da bi imali samo jedno resenje niz[0] i niz[3] tj. 1 + 4 = 5
                }
            }
        }
        if (brojac == 0) {
            System.out.println("Meta nije pronadjena");
        }
    }
}
