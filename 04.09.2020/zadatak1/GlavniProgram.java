package zadatak1;

public class GlavniProgram {
    public static void main(String[] args) {
        /*Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
        Moze da se sastavi tekstualni opis u obliku naziv[id].

        Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
        Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].

        Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].

        Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].

        Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
        Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
        Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava
        razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
        * */

        Pozoriste po1 = new Pozoriste("Beogradsko Dramsko Pozoriste");
        Pozoriste po2 = new Pozoriste("Jugoslovensko Dramsko Pozoriste");
        Pozoriste po3 = new Pozoriste("Narodno Pozoriste");
        System.out.println(po1.getNazivPozorista() + " ima oznaku " + po1.getId());
        System.out.println(po2.getNazivPozorista() + " ima oznaku " + po2.getId());
        System.out.println(po3); // isto je pozvali se na metodu toString() - System.out.println(po3.toString());

        Zaposleni z1 = new Zaposleni("Pera Peric", po1);
        System.out.println(z1);
        System.out.println(z1.getNazivPozorista());
        Zaposleni z2 = new Zaposleni("Mika Mikic", po3);
        System.out.println(z2);
        System.out.println(z2.getNazivPozorista());
        Zaposleni z3 = new Zaposleni("Luka Lukic", po3);
        System.out.println(z3);
        System.out.println(z3.getNazivPozorista());

        Glumac g1 = new Glumac("Slavko Slavkovic", po3,"Vuk Karadzic");
        Zaposleni z4 = new Glumac("Bojan Bojanic", po3,"statista broj 1"); // roditelj kreira dete
        System.out.println(g1);
        System.out.println(z4);

        Reditelj r1 = new Reditelj("Zika Zikic",po3,"Z");
        Zaposleni z5 = new Reditelj("Rajkoslav Rajic", po1,"Rajo"); // roditelj kreira dete
        Zaposleni z6 = new Glumac("Danijel Danic", po2,"statista broj 2"); // zaposleni je roditelj i glumcu i reditelju
        System.out.println(r1);
        System.out.println(z5);

        Predstava pr1 = new Predstava("Kostana","Jugoslovensko Dramsko Pozoriste");
        pr1.dodajZaposleniNaPredstavi(r1);
        pr1.dodajZaposleniNaPredstavi(g1);
        pr1.dodajZaposleniNaPredstavi(z4);
        pr1.dodajZaposleniNaPredstavi(z6);
        pr1.dodajZaposleniNaPredstavi(z3);

        // ispis predstave
        System.out.println("Broj zaposlenih na predstavi "+pr1.getNazivPredstave()+" je "+pr1.brojZaposlenihNaPredstavi());
        System.out.println(pr1);
        pr1.spisakSvihZaposlenih();
    }
}
//        // a moze i ovakav ispis spiska svih glumaca
//        for(int i = 0;i<pr1.brojZaposlenihNaPredstavi() ;i++){
//            System.out.println(pr1.getZaposleniNaPredstavi(i));
//        }