package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Nisha
 */

public class ExcelUtility {
	
	/**
	 * This method will read data from excel in string format 
	 * @param sheetname
	 * @param rowIndex
	 * @param colIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	
	/**
	 * This method will read number data from excel
	 * @param sheetname
	 * @param rowIndex
	 * @param colIndex
	 * @return number
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
    public double getNumberDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(colIndex).getCell(colIndex).getNumericCellValue();
		
    }
    
    /**
     * This method will read boolean data from excel
     * @param sheetname
     * @param rowIndex
     * @param colIndex
     * @return boolean
     * @throws EncryptedDocumentException
     * @throws IOException
     */
    
    public boolean getBooleanDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(colIndex).getCell(colIndex).getBooleanCellValue();
		
    }	
    
    /**
     * This method will read Date and Time  from excel
     * @param sheetname
     * @param rowIndex
     * @param colIndex
     * @return date and time
     * @throws EncryptedDocumentException
     * @throws IOException
     */
    
    public LocalDateTime getDateAndTimeDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(colIndex).getCell(colIndex).getLocalDateTimeCellValue();
		
    }	

}
