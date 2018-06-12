package Test;

import Pages.Login;
import Pages.SendEmail;
import Setup.configDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TesteEmail {
         WebDriver driverNavegador = configDriver.getDriver('C');;
         Login login;
         SendEmail sendEmail;


        @Test
        public void test() throws Exception {
            driverNavegador.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            login = new Login(driverNavegador);
            sendEmail = new SendEmail(driverNavegador);
            login.preencherCampos();
            sendEmail.preencherCampos();
        }
}
