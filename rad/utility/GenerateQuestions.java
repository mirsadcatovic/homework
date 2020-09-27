package rad.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenerateQuestions {
    private static FileOutputStream fo;
    private static XSSFWorkbook wb;
    public static final String sheetName = "questions";
    public static final String fileName = "table_with_questions.xlsx";

    public static void main(String[] args) {
        wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(sheetName);
        int numOfQuestions = 30;
        for (int i = 0; i < numOfQuestions; i++) {
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue("Question number " + (i + 1) + "?");
            cell = row.createCell(1);
            cell.setCellValue("pera" + (i + 1) + "@gmail.com");

        }
        try {
            fo = new FileOutputStream(fileName);
            wb.write(fo);
            wb.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}