import java.util.Scanner;

public class UnosNizaINjegovoStampanje {
    public static void main(String[] args) {
        int[] niz = new int[10];
        int i, max = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite brojeve koji ce predstavljati niz.");
        for (i = 0; i < niz.length; i++) {
            niz[i] = in.nextInt();
            if (i == 0) max = i;
            if (niz[i] > max) max = niz[i];
        }
        System.out.print("Clanovi niza su: ");
        for (i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println("");
        System.out.println("Najveci broj u nizu je: " + max);

    }
}
