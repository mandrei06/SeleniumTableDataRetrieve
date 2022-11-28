package main;

import main.entity.Country;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Andrei.Marincas/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement searchBar = driver.findElement(By.id("searchInput"));
        searchBar.sendKeys("List of countries by tax revenue to gdp ratio");
        searchBar.submit();

        WebElement table = driver.findElement(By.xpath("//table[contains(@class,'jquery-tablesorter')]"));
        List<WebElement> rowsList = table.findElements(By.tagName("tr"));
        List<WebElement> columnsList = null;
        int i = 0;
        List<Country> countryList=new ArrayList<>();
        for (WebElement row : rowsList) {
            columnsList = row.findElements(By.tagName("td"));
            if (!columnsList.isEmpty()) {
                System.out.println("Please wait, is loading:"+(i+15)/2+"%");
                i++;
                Country country = new Country(columnsList.get(0).getText()
                        , columnsList.get(1).getText(), columnsList.get(2).getText()
                        , columnsList.get(3).getText(), columnsList.get(4).getText()
                        , columnsList.get(5).getText(), columnsList.get(6).getText());
                countryList.add(country);
            }


        }


        float totalGdp=0;
        float totalTax=0;
        for(Country country:countryList){
            System.out.println(country);
            try{
            totalGdp+=Float.parseFloat(country.getGdp().replace("$","").replace(",",""));}
            catch (java.lang.NumberFormatException n){
                totalGdp+=0;
            }
            try{
            totalTax+=Float.parseFloat(country.getTaxRev().replace("$","").replace(",",""));}
            catch (java.lang.NumberFormatException n){
                totalTax+=0;
            }
        }
        System.out.println("Total GDP taxes:"+totalGdp+" total Tax Revenue:"+ totalTax);
    }
}
