package com.cg.conferenceRegistration.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {
	WebDriver driver;
	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	
	public void giveCardHolderName() {
		driver.findElement(cardHolderName).sendKeys("Shruthi");
	}
	
	public void giveDebitCardName() {
		driver.findElement(debitCardNo).sendKeys("123498761564");
	}
	
	public void giveCvvNumber() {
		driver.findElement(cvvNumber).sendKeys("999");
	}
	
	public void giveCardExpiryMonth() {
		driver.findElement(cardExpiryMonth).sendKeys("September");
	}
	
	public void giveCardExpiryYear() {
		driver.findElement(cardExpiryYear).sendKeys("2025");
	}
	
	public void clickNext() {
		driver.findElement(By.id("btnPayment")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
	}
}
