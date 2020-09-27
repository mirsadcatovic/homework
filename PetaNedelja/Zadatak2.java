import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        // Zadat je nenegativan broj. Sabirati njegove cifre sve dok rezultat ne bude samo jedna cifra. Ispisati je
        //UZIMA CIFRE OD POZADI
        int broj, cifra, zakljucati, brojac = 0, suma = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite pozitivan broj.");
        broj = in.nextInt();
        zakljucati = broj;

        while (broj <= 0) {
            System.out.println("Unesite pozitivan broj.");
            broj = in.nextInt();
            zakljucati = broj;
        }
        while (broj != 0) {
            cifra = broj % 10;
            suma += cifra;
            brojac++;
            if (suma >= 10) {
                suma -= cifra;
                brojac--;
                System.out.println("Suma prvih " + brojac + " cifara u broju " + zakljucati + " iznosi " + suma + ".");
                break;
            }
            broj /= 10;
        }
        System.out.println("Suma svih cifara u broju " + zakljucati + " iznosi " + suma + ".");
    }
}
