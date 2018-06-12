package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driverNavegador;
    WebDriverWait wait;
    By email = By.id("identifierId");
    By next = By.id("identifierNext");
    By senha = By.xpath("//input[@autocomplete='current-password']");
    By passNext = By.id("passwordNext");





    public Login(WebDriver driver){
        this.driverNavegador = driver;

    }

    public void preencherCampos() throws Exception{
        wait = new WebDriverWait(driverNavegador, 100);
        driverNavegador.findElement(email).sendKeys("contatestete123@gmail.com");

        driverNavegador.findElement(next).click();

        Thread.sleep(20000);

        driverNavegador.findElement(senha).sendKeys("contateste");

        driverNavegador.findElement(passNext).click();

    }
}
