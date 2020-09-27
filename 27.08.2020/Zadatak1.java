package metodeNizov;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*Napisati program koji će za uneti niz proveravati da li rastući ili nije rastući.
Kao dodatak zadatku, proveriti da li je niz rastući, opadajući ili ništa od toga.*/
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Koliko elemenata treba da ima niz?");
        n = in.nextInt();
        while (n <= 0 || n == 1) {
            if (n == 1) System.out.println("Niz mora da ima minimum dva clana da bi se odredilo njegovo sortiranje. Unesite broj veci od 0.");
            else System.out.println("Unesite broj veci od 0.");
            n = in.nextInt();
        }

        int[] niz = new int[n];
        pozivanjeNiza(niz);

        if (rastuci(niz).equals("Niz je rastuci.")) System.out.println(rastuci(niz));

        if (opadajuci(niz).equals("Niz je opadajuci.")) System.out.println(opadajuci(niz));

        if (rastuci(niz).equals("Niz nije rastuci.") && opadajuci(niz).equals("Niz nije opadajuci.")
                || rastuci(niz).equals("Niz nije rastuci ni opadajuci.")
                || opadajuci(niz).equals("Niz nije rastuci ni opadajuci.")) {
            System.out.println("Niz nije rastuci ni opadajuci.");
        }

    }

    public static void pozivanjeNiza(int[] metodaNiz) {
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite elemente niza.");
        for (int i = 0; i < metodaNiz.length; i++) {
            metodaNiz[i] = in.nextInt();
        }
    }

    public static String rastuci(int[] provera) {
        for (int i = 0; i < provera.length - 1; ) {
            for (int j = 1; j < provera.length; j++) {
                if (provera[i] == provera[j]) return "Niz nije rastuci ni opadajuci."; // bez ovoga niz [1 2 2 3 4] bi bio rastuci
                if (provera[i] > provera[j]) return "Niz nije rastuci.";
                i++;
            }
        }
        return "Niz je rastuci.";
    }

    public static String opadajuci(int[] provera) {
        for (int i = 0; i < provera.length - 1; ) {
            for (int j = 1; j < provera.length; j++) {
                if (provera[i] == provera[j]) return "Niz nije rastuci ni opadajuci."; // bez ovoga niz [4 3 3 2 1] bi bio opadajuci
                if (provera[i] < provera[j]) return "Niz nije opadajuci.";
                i++;
            }
        }
        return "Niz je opadajuci.";
    }
}