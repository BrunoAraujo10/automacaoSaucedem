package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDaLoja {
	
	WebDriver driver;
	
	
	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	
		
	}
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void pausar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void fecharNavegador() {
		driver.quit();
	}

}
