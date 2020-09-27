package zadatak2;

import java.util.UUID;

public class Account {

    private String number;
    private String name;
    private Double amount; // ovde pise Double, a ne double. Double znaci - public final class Double

    public Account(String name, String number){
        this.number=number;
        this.name=name;
        this.amount=0d; // bilo je this.amount=1d; i ispravili smo na 0d zato sto tekst kaze "Kada se napravi račun, stanje treba da bude jednako 0."
    }

    public Account(String name){
        this(name,UUID.randomUUID().toString());
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",number,name,amount);// ovde nam je ispis odvojen sa space a ne sa tab
    }
}