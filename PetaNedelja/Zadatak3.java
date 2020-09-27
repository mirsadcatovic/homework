import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //Za zadati ceo broj odrediti da li je on stepen broja 3.
        int unos;
        double broj = 0, i = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj da biste proverili da li je taj broj stepen broja 3.");
        unos = in.nextInt();

        while (broj <= unos) {
            broj = Math.pow(3, i); // 3 na i -- radi i sa nulti stepen
            i++;
            if (broj > unos) {
                System.out.println("Broj " + unos + " nije stepen od broja 3.");
                break;
            }
            if (broj == unos) {
                System.out.println(String.format("Broj %d je %.0f stepen od broja 3.", unos, (i - 1)));
                break;
            }
        }
    }
}