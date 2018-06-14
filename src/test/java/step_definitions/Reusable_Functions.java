package step_definitions;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Reusable_Functions {

    public static HashMap<String, String> hashMap = new HashMap<String, String>();
    public static void Take_Screenshot(WebDriver driver, Scenario scenario) throws IOException {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");

        File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotName = scenario.getName().replaceAll(" ", "_");
        File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-ExtendedReports/screenshots/" + screenshotName + ".png");
        FileUtils.copyFile(sourcePath, destinationPath);
        com.cucumber.listener.Reporter.addScreenCaptureFromPath(destinationPath.getAbsolutePath().toString());
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

    public  static void Wait()
    {
    }


    public static void EnterDropDown(WebDriver driver, WebElement element,String Element_Text, String Element_To_Select, WebDriverWait wait) throws InterruptedException {
        String DrpDown_Xpath = "//div[contains(text(),'"+Element_Text+"')]//following-sibling::div[3]";
        String Element_Xpath = "//div[contains(text(),'"+Element_To_Select+"')]";
        Actions performAct = new Actions(driver);
        performAct.sendKeys(element, Element_To_Select).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(DrpDown_Xpath)));
      // Thread.sleep(500);
        driver.findElement(By.xpath(Element_Xpath)).click();

    }

    public static void EnterTextBox(WebDriver driver,WebElement element,String Text_To_Enter) {
        //System.out.println("EnterTextBox");
        Actions performAct = new Actions(driver);
        performAct.sendKeys(element, Text_To_Enter).build().perform();
    }

    public static void ClickRadioButton(WebDriver driver, WebElement element) {
        element.click();


    }
}
