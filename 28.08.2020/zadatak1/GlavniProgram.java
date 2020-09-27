package zadatak1;

public class GlavniProgram {
    public static void main(String[] args) {
        /*
    Napisati glavni program koji kreira dva automobila.
    U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
        */
        Automobil a1, a2;

        a1 = new Automobil("Marcedes","SLR",12345,6); // izlazi iz fabrike sa zadatim parametrima
        a2 = new Automobil("Audi", "A4", 10548, 5); // izlazi iz fabrike sa zadatim parametrima

        a1.setVlasnik("Pera");
        a2.setVlasnik("Zika");
        System.out.println("Vlasnik "+a1.getMarka()+"-a sa serijskim brojem "+a1.getSerBr()+" je "+a1.getVlasnik()+" .");

        a1.setVlasnik("Mika");
        System.out.println(a1.getMarka()+" je sada kupio "+a1.getVlasnik()+" .");

        System.out.println("Drugi automobil je marke "+a2.getMarka()+".");
        System.out.println("To je model "+a2.getModel()+" sa promenjin menjacem od "+a2.setStepenPrenos(4)+" stepena prenosa."); // menja stepenPrenosa sa 5 na 4

        System.out.println(a2.setStepenPrenos(7)); // obavestenje o granicama i ostavnja stepenPrenosa na 4
        System.out.println(a2.setStepenPrenos(3)); // obavestenje o granicama i ostavnja stepenPrenosa na 4


    }
}
