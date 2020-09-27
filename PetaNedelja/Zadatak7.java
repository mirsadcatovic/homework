import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        /*Lakša varijanta: Napisati program koji vraća niz karaktera u obrnutom redosledu. Ulaz je niz char-ova.
Teža varijanta: Zadatak odraditi tako da se ne alocira dodatni prostor, već modifikuje ulazni niz
         */
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza.");
        n = in.nextInt();
        char[] niz = new char[n];

        System.out.println("Unesite elemente niza.");
        for (int i = 0; i < n; i++) {
            niz[i] = in.next().charAt(0);
        }
        System.out.println("Elementi unetog niza su:");
        for (int i = 0; i<n ;i++ ) {
            System.out.print(niz[i]+" ");
        }
        System.out.println("");

        System.out.println("Obrnuti redosled unetih elementa je:");
        for(int i=n-1;i>=0;i--){
            System.out.print(niz[i]+" ");
        }
    }
}