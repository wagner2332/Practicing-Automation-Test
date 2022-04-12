package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {
	
	 WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WAGNER\\OneDrive\\Área de Trabalho\\POO\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://marcelodebittencourt.com/demopages/demosimplesearch/");
		assertTrue("T[itulo da pagina difere do esperado", driver.getTitle().contentEquals("Demo Simple Search using JavaScript")); // verificacao de elementos da pagina web
		Thread.sleep(2000);
		
		
	}

}
