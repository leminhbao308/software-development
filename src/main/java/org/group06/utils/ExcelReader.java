package org.group06.utils;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.group06.model.entity.QuanAo;

/**
 *
 * @author lehoangnam
 */
public class ExcelReader {

    public static final int COLUMN_INDEX_MAQA = 0;
    public static final int COLUMN_INDEX_TENQA = 1;
    public static final int COLUMN_INDEX_SOLUONG = 2;
    public static final int COLUMN_INDEX_GIANHAP = 3;


    public static ArrayList<QuanAo> readExcel(File excelFilePath) throws IOException {
        ArrayList<QuanAo> dsQuanAo = new ArrayList<>();

        // Get file
        InputStream inputStream = new FileInputStream(excelFilePath);

        // Get workbook
        Workbook workbook = getWorkbook(inputStream, excelFilePath.getPath());

        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);

        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }

            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();

            // Read cells and set value for book object
            QuanAo qa = new QuanAo();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                if (cellValue == null || cellValue.toString().isEmpty()) {
                    continue;
                }
                // Set value for book object
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                    case COLUMN_INDEX_MAQA:
                        qa.setMaQA((String) getCellValue(cell));
                        break;
                    case COLUMN_INDEX_TENQA:
                        qa.setTenQA((String) getCellValue(cell));
                        break;
                    case COLUMN_INDEX_SOLUONG:
                        qa.setSoLuong(new BigDecimal((double) cellValue).intValue());
                        break;
                    case COLUMN_INDEX_GIANHAP:
                        qa.setGiaNhap((Double) getCellValue(cell));
                        break;
                    default:
                        break;
                }

            }
            dsQuanAo.add(qa);
        }

        workbook.close();
        inputStream.close();

        return dsQuanAo;
    }

    // Get Workbook
    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }

    // Get cell value
    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellType();
        Object cellValue = null;
        switch (cellType) {
            case BOOLEAN:
                cellValue = cell.getBooleanCellValue();
                break;
            case FORMULA:
                Workbook workbook = cell.getSheet().getWorkbook();
                FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                cellValue = evaluator.evaluate(cell).getNumberValue();
                break;
            case NUMERIC:
                cellValue = cell.getNumericCellValue();
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case _NONE:
            case BLANK:
            case ERROR:
                break;
            default:
                break;
        }

        return cellValue;
    }
}
