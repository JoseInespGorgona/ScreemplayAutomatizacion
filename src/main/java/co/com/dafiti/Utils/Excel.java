package co.com.dafiti.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    //HOJA DE EXCEL
    private XSSFWorkbook libro;
    private FileInputStream file;

    public String leerDatosExcel(String ruta, String hoja, int rowValue, int cellValue) throws IOException {
        String valor = null;
        //cargar el archivo
        file = new FileInputStream(new File(ruta));
        //Mostrar los datos del archivo que cargamos
        libro = new XSSFWorkbook(file);
        //Hoja de excel
        Sheet sheet = libro.getSheet(hoja);
        //Fila
        Row row = sheet.getRow(rowValue);
        //Celda
        Cell cell = row.getCell(cellValue);
        valor = cell.getStringCellValue();
        libro.close();
        file.close();
        return valor;
    }
}
