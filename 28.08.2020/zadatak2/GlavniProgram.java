package zadatak2;

import java.util.Arrays;

public class GlavniProgram {
    public static void main(String[] args) {
        // Zgrada ima adresu na kojoj se nalazi, spratnost, broj stanova, prezimena stanara.
        // Sve tipove metoda u ovoj klasi treba iskoristiti u glavnom programu gde cete kreirati dve zgrade.

        Zgrada z1, z2;

        z1 = new Zgrada("Takovska 18", 2, 6);
        z2 = new Zgrada("Savska 27", 4, 8);

        // unos i stampanje prezimena za z1
        String[] prezimenaZ1 = new String[z1.getBrStanova()]; // prezima vlasnika je broj stanova - 6 za z1
        z1.setPrezimenaS(prezimenaZ1); // unosimo 6 prezimena
        System.out.println("Prezimena porodica u prvoj zgradi su: " + Arrays.toString(z1.getPrezimenaS())); // stampa niz sa 6 prezimena

        // unos i stampanje prezimena za z2
        String[] prezimenaZ2 = new String[z2.getBrStanova()];
        z2.setPrezimenaS(prezimenaZ2);
        System.out.println("Prezimena porodica u drugoj zgradi su: " + Arrays.toString(z2.getPrezimenaS()));
        System.out.println("Prezimena porodica u prvoj zgradi su: " + Arrays.toString(z1.getPrezimenaS())); // da vidimo da li su ostala ista prezimena za z1

        // get i set adrese
        System.out.println("Adresa prve zgrade je " + z1.getAdresa()); // Takovska 18 za z1
        z1.setAdresa("Pozeska 23");
        System.out.println("Sada je adresa prve zgrade " + z1.getAdresa()); // Pozeska 23 za z1

        // get i set spratnosti
        System.out.println("Trenutan spratnost prve zgrade je " + z1.getSpratnost()); // 2 za z1
        z1.setSpratnost(3);
        System.out.println("Sada je spratnost prve zgrade " + z1.getSpratnost()); // 3 za z1

        // get i set za broj stanova
        System.out.println("Broj stanova u drugoj zgradi je " + z1.getBrStanova()); // 6 za z1
        z1.setBrStanova(4);
        System.out.println("Sada je broj stanova u drugoj zgradi " + z1.getBrStanova()); // 4 za z1

        // imena prezimena u nizu
        System.out.println("Prezimena porodica u prvoj zgradi su: " + Arrays.toString(z1.getPrezimenaS()));
        z1.setPrezimenaS(prezimenaZ1);
        System.out.println("Promenjena prezimena porodica u prvoj zgradi su: " + Arrays.toString(z1.getPrezimenaS()));
    }
}
// String[] prezimenaZ1 = new String[z1.getBrStanova()]; iz reda 17 mi kaze da niz ima 6 clanova,
// a u 39 sa rekao da je sada 4, ali mi stampa niz sa prvih 4 nova prezimena, a zadnja 2 su iz starog niza
// nisam znao kako to da resim. isto pravi problem kada se niz povecava u odnosu na pocetni. tada izlazi greska da niz izlazi iz granica