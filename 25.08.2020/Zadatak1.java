import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
    Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
*/
        int opcija;
        double racun = 0, placanje, cena;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Dobrodosli u meni samousluzne kase. Ponudjene opcije su:");
            System.out.println("1 -za unos cene izabranog proizvoda koja se dodaje na Vas racun");
            System.out.println("2 -za unos novca da biste izmirili Vas racun");
            System.out.println("0 -za izlaz iz programa");

            opcija = in.nextInt();
            switch (opcija) {
                case 0:
                    System.out.println("Izabrali ste opciju izlaz.");
                    System.out.println("Hvala sto koristite nase usluge.");
                    return;

                case 1:
                    System.out.println("Unesite cenu proizvoda:");
                    cena = in.nextDouble();
                    while (cena < 0) {
                        System.out.println("Uneli ste neispravnu cenu.");
                        System.out.println("Unesite cenu proizvoda:");
                        cena = in.nextDouble();
                    }
                    racun += cena;
                    System.out.println(String.format("Vas racun do sada iznosi : %.2f RSD.", racun));
                    break;

                case 2:
                    System.out.println(String.format("Vas racun do sada iznosi : %.2f RSD.", racun));
                    System.out.println("Unesite iznos novca kako biste izmirili Vas racun");

                    placanje = in.nextDouble();
                    if (placanje < racun) {
                        System.out.println("Uneli ste iznos koji je manji od Vaseg racuna.");
                        System.out.println(String.format("Vas racun iznosi: %.2f RSD.", racun));
                    } else {
                        if (racun == 0) System.out.println("Vasa korpa je prazna.");
                        else {
                            System.out.println(String.format("Vas kusur iznosi: %.2f RSD.", (placanje - racun)));
                            racun = 0;
                        }
                    }
                    break;

                default:
                    System.out.println("Uneli ste nepostojecu opciju. Molimo Vas pokusajte ponovo.");
                    break;
            }
        }
    }
}