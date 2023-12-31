// Generated by Selenium IDE
package org.ual.hmis.equipo20;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeOptions;
public class BotonessuperioresTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	    // Browser selector
	    int browser= 0; // 0: firefox, 1: chrome,...
	    Boolean headless = false;

	    switch (browser) {
	    case 0:  // firefox
	    	// Firefox
	    	// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
	    	// Descomprimir el archivo geckodriver.exe en la carpeta drivers

	    	System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
	    	FirefoxOptions firefoxOptions = new FirefoxOptions();
	    	firefoxOptions.setHeadless(true);
	    	driver = new FirefoxDriver(firefoxOptions);

	    	break;
	    case 1: // chrome
	    	// Chrome
	    	// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
	    	// Descomprimir el archivo chromedriver.exe en la carpeta drivers

	    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    	ChromeOptions chromeOptions = new ChromeOptions();
	    	chromeOptions.setHeadless(true);
	    	chromeOptions.addArguments("window-size=1920,1080");
	    	driver = new ChromeDriver(chromeOptions);

	    	break;

	    default:
	    	fail("Please select a browser");
	    	break;
	    }
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void botonalejandro() {
    // Test name: boton-alejandro
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Miembros | 
    driver.findElement(By.linkText("Miembros")).click();
    // 4 | click | linkText=Alejandro | 
    driver.findElement(By.linkText("Alejandro")).click();
    // 5 | assertText | css=h2 | Alejandro Tomás Soto Meca
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Alejandro Tomás Soto Meca"));
  }
  @Test
  public void botondavid() {
    // Test name: boton-david
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Miembros | 
    driver.findElement(By.linkText("Miembros")).click();
    // 4 | click | linkText=David | 
    driver.findElement(By.linkText("David")).click();
    // 5 | assertText | css=h2 | David Hernández Carmona
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("David Hernández Carmona"));
  }
  @Test
  public void botonequipo20() {
    // Test name: boton-equipo20
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Equipo 20 | 
    driver.findElement(By.linkText("Equipo 20")).click();
    // 4 | assertText | css=ol > li:nth-child(1) | Alejandro Tomás Soto Meca
    assertThat(driver.findElement(By.cssSelector("ol > li:nth-child(1)")).getText(), is("Alejandro Tomás Soto Meca"));
  }
  @Test
  public void botonpaginaprincipal() {
    // Test name: boton-pagina-principal
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Página principal | 
    driver.findElement(By.linkText("Página principal")).click();
    // 4 | assertText | id=banner | Equipo 20\nEste equipo está formado por los siguientes miembros:\nAlejandro Tomás Soto Meca\nDavid Hernández Carmona\n© Untitled. All rights reserved.Design: HTML5 UP
    assertThat(driver.findElement(By.id("banner")).getText(), is("Equipo 20\\\\nEste equipo está formado por los siguientes miembros:\\\\nAlejandro Tomás Soto Meca\\\\nDavid Hernández Carmona\\\\n© Untitled. All rights reserved.Design: HTML5 UP"));
  }
  @Test
  public void nobotonalejandro() {
    // Test name: no-boton-alejandro
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Miembros | 
    driver.findElement(By.linkText("Miembros")).click();
    // 4 | click | linkText=Alejandro | 
    driver.findElement(By.linkText("Alejandro")).click();
    // 5 | assertNotText | css=h2 | Alejandro Tomás Soto Meca
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is(not("Alejandro Tomás Soto Meca")));
  }
  @Test
  public void nobotondavid() {
    // Test name: no-boton-david
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Miembros | 
    driver.findElement(By.linkText("Miembros")).click();
    // 4 | click | linkText=David | 
    driver.findElement(By.linkText("David")).click();
    // 5 | assertNotText | css=h2 | David Hernández Carmona
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is(not("David Hernández Carmona")));
  }
  @Test
  public void nobotonequipo20() {
    // Test name: no-boton-equipo20
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Equipo 20 | 
    driver.findElement(By.linkText("Equipo 20")).click();
    // 4 | assertNotText | id=banner | Equipo 20\nEste equipo está formado por los siguientes miembros:\nAlejandro Tomás Soto Meca\nDavid Hernández Carmona\n© Untitled. All rights reserved.Design: HTML5 UP
    assertThat(driver.findElement(By.id("banner")).getText(), is(not("Equipo 20\\\\nEste equipo está formado por los siguientes miembros:\\\\nAlejandro Tomás Soto Meca\\\\nDavid Hernández Carmona\\\\n© Untitled. All rights reserved.Design: HTML5 UP")));
  }
  @Test
  public void nobotonpaginaprincipal() {
    // Test name: no-boton-pagina-principal
    // Step # | name | target | value
    // 1 | open | https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html | 
    driver.get("https://hmis2023-sesion04-freeweb.azurewebsites.net/index.html");
    // 2 | setWindowSize | 1021x727 | 
    driver.manage().window().setSize(new Dimension(1021, 727));
    // 3 | click | linkText=Página principal | 
    driver.findElement(By.linkText("Página principal")).click();
    // 4 | assertNotText | id=banner | Equipo 20\nEste equipo está formado por los siguientes miembros:\nAlejandro Tomás Soto Meca\nDavid Hernández Carmona\n© Untitled. All rights reserved.Design: HTML5 UP
    assertThat(driver.findElement(By.id("banner")).getText(), is(not("Equipo 20\\\\nEste equipo está formado por los siguientes miembros:\\\\nAlejandro Tomás Soto Meca\\\\nDavid Hernández Carmona\\\\n© Untitled. All rights reserved.Design: HTML5 UP")));
  }
}
