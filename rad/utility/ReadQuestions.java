package rad.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadQuestions {
    private static FileInputStream fi;
    private static XSSFWorkbook wb;

    public static void readExcel() {

        try {
            fi = new FileInputStream(GenerateQuestions.fileName);
            wb = new XSSFWorkbook(fi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String catchCell(Integer excelRow, Integer excelCell) {
        readExcel();
        Sheet sheet = ReadQuestions.wb.getSheetAt(0);
        Row row = sheet.getRow(excelRow);
        Cell cell = row.getCell(excelCell);
        if (cell == null) {
            return "Error. Cell is empty.";
        } else return cell.toString();
    }
}