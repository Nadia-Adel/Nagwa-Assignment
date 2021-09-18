package testBase;

import java.io.File;

import org.testng.annotations.DataProvider;

public class readFromExcel {
	
	@DataProvider(name = "TestData")
    public Object[][] ReadFromexcel()
    {
        ExcelFileManager excel = new ExcelFileManager(new File("Book1.xlsx"));
        excel.switchToSheet("Sheet1");

        String[] col = {"Search Text"};
        Object[][]Locator = new Object[2][20];
        for (int i=2;i<3;i++) {
        	for(int  j=0;j<18;j++)
            Locator[i-2][j] =excel.getCellData(col[j], i);
        }
        return Locator;
    }

}
