package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class configDriver {

    static WebDriver driver;

    public static WebDriver getDriver(char navegador){
        //Validação para verificar se o driver já foi inicializado, caso sim, não abre outra janela mais de uma
        if (driver == null) {
            switch (navegador) {
                case 'C':
                    try {
                        //Driver p/ Mac
                        System.setProperty("webdriver.chrome.driver", "chromedriver");
                        driver = new ChromeDriver();
                        System.out.println("ChromeDriver inicializado na 2.37 p/ Mac");
                    } catch (NullPointerException e) {
                        //Driver p/ IDE
                        System.setProperty("webdriver.chrome.driver", "chromedriver_36");
                        driver = new ChromeDriver();
                        System.out.println("ChromeDriver inicializado na 2.36 p/ testes IDE");
                    } catch (Exception f){
                        //Driver p/ testes Jenkins
                        System.setProperty("webdriver.chrome.driver", "chromedriver_34");
                        driver = new ChromeDriver();
                        System.out.println("ChromeDriver inicializado na 2.34 p/ testes Jenkins");
                    }
                    break;

                default:
                    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }
}
