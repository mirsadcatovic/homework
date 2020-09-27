import java.util.Scanner;

public class DanUGodini_v3 {
    public static void main(String[] args) {
        int[] mesec = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] mesecPrestupna = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumDan = 0, sumMesec = 0, sum;
        int danUMesecuUnos, mesecUnos, godinaUnos;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite dan u mesecu.");
        danUMesecuUnos = in.nextInt();
        while (danUMesecuUnos <= 0 || danUMesecuUnos > 32) {
            System.out.println("Morate uneti vrednosti od 1 do 31.");
            danUMesecuUnos = in.nextInt();
        }

        System.out.println("Unesite mesec.");
        mesecUnos = in.nextInt();
        while (mesecUnos <= 0 || mesecUnos >= 13) {
            System.out.println("Morate uneti vrednosti od 1 do 12.");
            mesecUnos = in.nextInt();
        }

        System.out.println("Unesite godinu.");
        godinaUnos = in.nextInt();
        if (godinaUnos % 4 == 0 && (godinaUnos % 100 != 0 || godinaUnos % 400 == 0)) {
            for (int i = 0; i < mesecUnos - 1; i++) {
                sumMesec += mesecPrestupna[i];
            }
        }else {
            for (int i = 0; i < mesecUnos - 1; i++) {
            sumMesec += mesec[i];
            }
        }

        sumDan += danUMesecuUnos;
        sum = sumDan + sumMesec;
        System.out.println("Uneti datum je " + sum + " dan u mesecu.");
    }
}