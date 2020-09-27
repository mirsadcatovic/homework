import java.util.Scanner;

public class UnosGodinaIDveStarosneKategorije {
    public static void main(String[] args) {
        int godine, brojac1 = 0, brojac2 = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj godina za 10 osoba:");
        for (int i = 0; i < 10; i++) {
            godine = in.nextInt();
            if (godine >= 18 && godine <= 50) {
                brojac1++;
            }
            if (godine < 18 && godine > 0) {
                brojac2++;
            }
            if (godine <= 0) {
                System.out.println("Uneta godina mora biti veca od 0.");
                i--;
            }
        }
        System.out.println("Od unetih 10 osoba " + brojac1 + " osoba je starosti izmedju 18 i 50 godina, a " + brojac2 + " osoba je mladje od 18 godina.");
    }
}
