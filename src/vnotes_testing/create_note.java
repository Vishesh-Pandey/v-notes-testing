package vnotes_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class create_note {
	
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
       
        driver.findElement(By.name("create-new-note")).click();
        
        // adding title and note
        WebElement title = driver.findElement(By.name("title"));
        title.sendKeys("Testing Title");
        WebElement note = driver.findElement(By.name("note"));
        note.sendKeys("Testing Note");
        
        Thread.sleep(2000);  
        
        // click on save note - this is creating issue
        driver.findElement(By.name("save-note")).click();
        
        
}
}
