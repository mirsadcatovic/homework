package zadatak2;

public class Glavni {
    public static void main(String[] args) {
        Bank b = new Bank();
        Account ac1 = new Account("Petar","1234");
        System.out.println(ac1);
        Account ac2 = new Account("Marko");
        System.out.println(ac2);
        System.out.print(b.getAccount("Petar"));
    }
}
