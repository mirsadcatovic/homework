package zadatak2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CitanjeExela {
    /*2. Napraviti klasu za citanje excel tabele koja poseduje metodu koja kreira potreban tok podataka
    kojoj se prosledjuje putanja do fajla i metodu kojoj se prosledjuju dva cela broja
    (jedan za red, drugi za kolonu u tabeli).

    Koristeci istu klasu, pristupiti tabeli i citati podatke koji se nalaze u zadatom redu i koloni.

    Dodatak: Nadograditi klasu da omogucava i unos podataka u zadati red i kolonu.
    */
    private static FileInputStream fi;
    private static XSSFWorkbook wb;

    public static FileInputStream getFi() {
        return fi;
    }

    public static XSSFWorkbook getWb() {
        return wb;
    }

    public static void ucitavanjeExela() {

        try {
            fi = new FileInputStream("pet_shop.xlsx");
            wb = new XSSFWorkbook(fi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String uzimanjePodatakaIzCelije(Integer stranica, Integer red, Integer kolona) {
        ucitavanjeExela();
        Sheet sheet = CitanjeExela.getWb().getSheetAt(stranica);
        Row row = sheet.getRow(red);
        Cell cell = row.getCell(kolona);
        if (cell == null) {
            return "Greska. Celija je prazna.";
        } else return cell.toString();
    }

    public static void main(String[] args) {
        // metodi zadajem stranica 0, red 0 i kolona 8 i vraca "Save Kovacevica 2"
        try {
            System.out.println(uzimanjePodatakaIzCelije(0, 0, 8));
            wb.close();
            fi.close();
        } catch (NullPointerException e) {
            System.out.println("Greska. Celija je prazna.");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Greska. Izabrana stranica ne postoji.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}