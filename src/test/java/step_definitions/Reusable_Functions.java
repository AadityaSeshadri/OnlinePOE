package step_definitions;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Reusable_Functions {

    public static HashMap<String, String> hashMap = new HashMap<String, String>();
    public static void Take_Screenshot(WebDriver driver, Scenario scenario)
    {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
    public static void Set_PreRequisites(Scenario scenario) throws IOException {
        FileUtils.deleteDirectory(new File(System.getProperty("user.dir")+"//log"));
        FileUtils.forceMkdir(new File(System.getProperty("user.dir")+"//log"));
        FileUtils.deleteDirectory(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"));
        FileUtils.forceMkdir(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots"));
        FileUtils.forceMkdir(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+scenario.getName()));
        PropertyConfigurator.configure("log4j.properties");


    }


    public static void getData(String ScenarioName) throws IOException {
        InputStream ExcelFileToRead = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testData/SampleData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);

        XSSFWorkbook test = new XSSFWorkbook();

        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row;
        XSSFCell cell;


        //System.out.println("AAA+++++++++++++++" + sheet.getRow(0).getCell(0).getStringCellValue());
        int row_count = sheet.getLastRowNum();
       // System.out.println("row_Count" + row_count);

        for (int i = 0; i < row_count; i++) {
            if (sheet.getRow(i).getCell(0).getStringCellValue().contentEquals(ScenarioName)) {
                for (int j = 1; j < sheet.getRow(i).getLastCellNum(); j++) {
                    hashMap.put(sheet.getRow(0).getCell(j).getStringCellValue(), sheet.getRow(i).getCell(j).getStringCellValue());

                }
            }
            //System.out.println("*******************");
        }
    }

    public static boolean Check_DropDownDefaultValue(WebElement element,String Text)
    {
        boolean bool = false;
        if ( element.isDisplayed())
        {
            Select Sel = new Select(element);
            WebElement Drp_First_option = Sel.getFirstSelectedOption();
            if (Drp_First_option.getText().equals(Text)) {
                bool =  true;
            } else {
                bool =  false;
            }
        }
        return bool;
    }

    public static String Get_TextBoxValue(WebElement element)
    {
        String Text = "";
        if (element.isDisplayed())
        {
            Text =  element.getText();
            }
            return Text;

    }
    public static String Get_LabelValue(WebElement element)
    {
        String Text = "";
        if (element.isDisplayed()) {
            Text =  element.getText();
        }
        return Text;

    }


    public static boolean Chk_DropDownOptions(WebElement element,String[] values) {
        boolean bool = false;
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement we : options) {
            for (int i = 0; i < values.length; i++) {
                if (we.getText().equals(values[i])) {
                    bool = true;
                } else {
                    bool = false;
                }
            }
        }
        return bool;
    }


}
