package utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	public static FileInputStream fi;
	public FileOutputStream fo;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public XSSFRow row;
	public static XSSFCell cell;
	public CellStyle style;   
	
    public static int totalRow;

    public List<Map<String, String>> getData(String sheetName) throws IOException {
        Workbook workbook = WorkbookFactory.create(new File(AppUtils.XL_PATH));
        Sheet sheet = workbook.getSheet(sheetName);
        workbook.close();
        return readSheet(sheet);
    }

    private List<Map<String, String>> readSheet(Sheet sheet) {
        Row row;
        Cell cell;
        totalRow = sheet.getLastRowNum();
        List<Map<String, String>> excelRows = new ArrayList<>();
        for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
            row = sheet.getRow(currentRow);
            int totalColumn = row.getLastCellNum();
            LinkedHashMap<String, String> columnMapData = new LinkedHashMap<>();
            for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
                cell = row.getCell(currentColumn);
                String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();
                if (null != cell)
                    columnMapData.put(columnHeaderName, cell.getStringCellValue());
                else
                    columnMapData.put(columnHeaderName, "");
            }
            excelRows.add(columnMapData);
        }
        return excelRows;
    }

    public int countRow() {
        return totalRow;
    }
    
	//data driven through feature file
	private static int getDataRow(String dataKey, int dataColumn) {
		int rowCount = sheet.getLastRowNum();
	
		for(int row=0; row<= rowCount; row++){
			String excelKey = ExcelReader.getCellData(row, dataColumn);
			
			if(ExcelReader.getCellData(row, dataColumn).equalsIgnoreCase(dataKey)){
				return row;
			}
		}
		return 0;		
	}

	private static String getCellData(int rowNumb, int colNumb) {
		cell = sheet.getRow(rowNumb).getCell(colNumb);
		if(cell == null) {
			return "";
		}
		if(cell.getCellType() == CellType.NUMERIC) {
			cell.setCellType(CellType.STRING);
		}
		String cellData = cell.getStringCellValue();
		return cellData;
	}
    
	public static Map<String, String> getData(String dataKey, String sheetName) throws Exception {

		Map<String, String> dataMap = new HashMap<String, String>();
		fi=new FileInputStream(AppUtils.XL_PATH);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);

		int dataRow = getDataRow(dataKey.trim(), 0);

		if (dataRow == 0) {
			throw new Exception("NO DATA FOUND for dataKey: "+dataKey);
		}

		int columnCount = sheet.getRow(dataRow).getLastCellNum();

		for(int i=0;i<columnCount;i++) {
			cell = sheet.getRow(dataRow).getCell(i);
			String cellData = null; 
			if (cell != null) {
				if(cell.getCellType() == CellType.NUMERIC) {
					cell.setCellType(CellType.STRING);
				}
				cellData = cell.getStringCellValue();
			}
			dataMap.put(sheet.getRow(0).getCell(i).getStringCellValue(), cellData);
		}
		return dataMap;
	}

}