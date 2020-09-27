import java.util.Arrays;
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

//        Za zadat niz koji sadrži n različitih brojeva uzetih iz skupa 0, 1, 2, ..., n
//        pronaći jedan koji u tom nizu nedostaje.
//        Primeri: Ulaz: [3,1,0], Izlaz: 2
//        Ulaz: [4,2,3,5,7,0,1], Izlaz: 6

        Scanner unos = new Scanner(System.in);
        int n, zbirN, sumaNiza;

        System.out.println("Uneti broj(n) clanova niza.");
        n = unos.nextInt();
        int[] niz = new int[n - 1];

        System.out.println("Uneti (n - 1) clanova niza.");
        niz[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            niz[i] = unos.nextInt();
        }
        System.out.println(Arrays.toString(niz));
        zbirN = (n - 1) * n / 2;
        sumaNiza = 0;
        for (int i = 0; i < n - 1; i++) {
            sumaNiza += niz[i];
        }
        System.out.println("Clan koji nedostaje je: " + (zbirN - sumaNiza) + ".");
    }
}