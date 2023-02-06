package vnotes_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class view_notes {
	@Test
    public static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vishesh-pandey.github.io/v-notes/");
        
        //login
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("vishesh");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("pandey");
        driver.findElement(By.name("login")).click();
        
        // waiting for login to happen
        Thread.sleep(5000);  
       
        
        // click on view-all-notes 
        driver.findElement(By.name("view-all-notes")).click();
        
       
}
}
