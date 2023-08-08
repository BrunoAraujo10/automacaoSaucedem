package Elementos;

import org.openqa.selenium.By;

public class ElementosDaLoja {
	
	private By userName = By.id("user-name");
	private By password = By.id("password");
	private By btnLogin = By.id("login-button");
	private By btnAddToCart = By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button");
	private By carrinho = By.id("shopping_cart_container");
	private By checkout = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]");
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By codePostal = By.id("postal-code");
	private By btnContinue = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");
	private By btnFinish = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]");
	private By menuLateral = By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	private By logout = By.id("logout_sidebar_link");
	
	
	
	
	public By getMenuLateral() {
		return menuLateral;
	}
	public By getLogout() {
		return logout;
	}
	public By getBtnAddToCart() {
		return btnAddToCart;
	}
	public By getCarrinho() {
		return carrinho;
	}
	public By getCheckout() {
		return checkout;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getCodePostal() {
		return codePostal;
	}
	public By getBtnContinue() {
		return btnContinue;
	}
	public By getUserName() {
		return userName;
	}
	public By getPassword() {
		return password;
	}
	public By getBtnLogin() {
		return btnLogin;
	}
	public By getBtnFinish() {
		return btnFinish;
	}

	
	}


