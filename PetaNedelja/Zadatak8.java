import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        /*A) Napisati program koji za uneti broj telefona (u vidu String-a) ispisuje informaciju o tome da li je broj
napisan u odgovarajućem formatu. Pretpostaviti da se validan telefonski broj može pojaviti u jednom od
sledećih formata:
(xxx) xxx-xxxx ili xxx-xxx-xxxx gde 'x' predstavlja jednu cifru.
B) Modifikovati program tako da on učitava brojeve telefona sve dok korisnik ne unese reč 'stop'.
        */
        String unos;
        char ch5 = ' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite telefonski broj u formatu xxx-xxx-xxxx ili (xxx) xxx-xxxx .");
        System.out.println("Simbol x prestavlja cifru telefonskog broja.");
        unos = scan.nextLine();
        boolean ispravno = true;

        while (!unos.equals("stop")) {
            if (unos.length() == 12) {
                for (int i = 0; i < 12; i++) {
                    switch (i) {
                        case 3:
                            ispravno = unos.charAt(3) == '-';
                            break;
                        case 7:
                            ispravno = unos.charAt(7) == '-';
                            break;
                        default:
                            ispravno = Character.getNumericValue(unos.charAt(i)) >= 0 && Character.getNumericValue(unos.charAt(i)) <= 9;
                            break;
                    }
                    if (!ispravno) break;
                }
                if (!ispravno) System.out.println("Pogresno unesen format telefonskog broja");
                else System.out.println(unos + " je validan telefonski broj.");
            }
            if (unos.length() == 14) {
                for (int i = 0; i < 14; i++) {
                    switch (i) {
                        case 0:
                            ispravno = unos.charAt(0) == '(';
                            break;
                        case 4:
                            ispravno = unos.charAt(4) == ')';
                            break;
                        case 5:
                            ispravno = unos.charAt(5) == ' ';
                            break;
                        case 9:
                            ispravno = unos.charAt(9) == '-';
                            break;
                        default:
                            ispravno = Character.getNumericValue(unos.charAt(i)) >= 0 && Character.getNumericValue(unos.charAt(i)) <= 9;
                            break;
                    }
                    if (!ispravno) break;
                }
                if (!ispravno) System.out.println("Pogresno unesen format telefonskog broja");
                else System.out.println(unos + " je validan telefonski broj.");
            }
            if (unos.length() != 12 && unos.length() != 14) {
                System.out.println("Uneti telefonski broj nema tacnu duzinu");
            }
            System.out.println("");
            System.out.println("Unesite telefonski broj u formatu xxx-xxx-xxxx ili (xxx) xxx-xxxx .");
            System.out.println("Simbol x prestavlja cifru telefonskog broja.");
            unos = scan.nextLine();
        }
    }
}
