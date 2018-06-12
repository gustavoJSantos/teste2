package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driverNavegador;
    WebDriverWait wait;

    public Login(WebDriver driver){
        this.driverNavegador = driver;

    }

    public void preencherCampos(){
        wait = new WebDriverWait(driverNavegador, 100);
        WebElement email = driverNavegador.findElement(By.id("identifierId"));
        email.sendKeys("contatestete123@gmail.com");

        WebElement next = driverNavegador.findElement(By.id("identifierNext"));
        next.click();

        driverNavegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement senha = driverNavegador.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        senha.sendKeys("contateste");

        WebElement passNext = driverNavegador.findElement(By.id("passwordNext"));
        passNext.click();

    }
}
