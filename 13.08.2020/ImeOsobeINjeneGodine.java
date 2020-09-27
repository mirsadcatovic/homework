import java.util.Scanner;

public class ImeOsobeINjeneGodine {
    public static void main(String[] args) {
        String[] ime = {"Petar", "Marko", "Srdjan", "Tijan", "Sandra", "Milica"};
        String imeUnos;
        int[] godine = {18, 19, 20, 21, 22, 23};
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite jedno ime.");
        imeUnos = in.next();
        switch (imeUnos) {
            case "Petar":
                System.out.println("Petar ima " + godine[0] + " godina.");
                break;
            case "Marko":
                System.out.println("Petar ima " + godine[1] + " godina.");
                break;
            case "Srdjan":
                System.out.println("Petar ima " + godine[2] + " godina.");
                break;
            case "Tijana":
                System.out.println("Petar ima " + godine[3] + " godina.");
                break;
            case "Sandra":
                System.out.println("Petar ima " + godine[4] + " godina.");
                break;
            case "Milica":
                System.out.println("Petar ima " + godine[5] + " godina.");
                break;
            default:
                System.out.println("Za uneto ime nemamo podatak o broju godine te osobe.");
                break;
        }
    }
}
