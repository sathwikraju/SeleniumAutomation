package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationAndLoginAutomation {
	public static void main(String[] args) {
		// Set the path to your Chrome WebDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathw\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Initialize the Chrome WebDriver
		WebDriver driver = new ChromeDriver();

		// Open the registration page
		driver.get("http://localhost:4200/registration");

		// Find registration form elements
		WebElement registrationUsernameField = driver.findElement(By.name("username"));
		WebElement registrationPasswordField = driver.findElement(By.name("password"));
		WebElement registrationSubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Enter registration information
		registrationUsernameField.sendKeys("user");
		registrationPasswordField.sendKeys("password");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		registrationSubmitButton.click();

		// Find login form elements
		WebElement loginUsernameField = driver.findElement(By.name("username"));
		WebElement loginPasswordField = driver.findElement(By.name("password"));
		WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Enter login credentials
		loginUsernameField.sendKeys("user");
		loginPasswordField.sendKeys("password");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		loginSubmitButton.click();

		try {
			Thread.sleep(3000); // Sleep for 5 seconds (5000 milliseconds)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the browser when done
		driver.quit();
	}
}
