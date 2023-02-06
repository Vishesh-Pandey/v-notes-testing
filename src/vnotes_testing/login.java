package vnotes_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	@Test
    public static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vishesh-pandey.github.io/v-notes/");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("vishesh");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("pandey");
        Thread.sleep(2000);  
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);  
}
}
