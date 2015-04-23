package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSLaunchtest {

	
	
	

	private WebDriver dr=null;

	@Test
	public void setUp() throws Exception {
		

				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("appium-version", "1.0");
				capabilities.setCapability("platformName", "iOS");
				capabilities.setCapability("platformVersion", "8.1");
				capabilities.setCapability("deviceName", "iPhone 6");
				capabilities.setCapability("app", "/Users/stefanaronsen/Library/Developer/Xcode/DerivedData/Deli-dpibcmjkqigbooemrebljxgblcji/Build/Products/Debug-iphonesimulator/deliapp.app");
				// dr = null;
				try {
					dr = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("App launched");
				
					
				}

					dr.manage().timeouts().implicitlyWait(120                                                                                                                                                                                                            , TimeUnit.SECONDS);
					dr.findElement(By.name("Have an account? Log in")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[2]/UIATableCell[1]/UIATextField[1]")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIATextField[1]")).sendKeys("qaautomation2");
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[2]/UIASecureTextField[1]")).sendKeys("testtest");
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]")).click();
					// dr.findElement(By.name("OK")).click();
					// dr.findElement(By.name("OK")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[4]")).click();
					dr.findElement(By.name("Continue")).click();
					dr.findElement(By.name("Get Started")).click();
					dr.findElement(By.name("Don’t Allow")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[5]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
				
					dr.findElement(By.name("Clear text")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIASearchBar[1]")).click();
					dr.findElement(By.name("L")).click();
					dr.findElement(By.name("o")).click();
					dr.findElement(By.name("s")).click();
					dr.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]")).click();
                    try {
                    	dr.findElement(By.name("Los Angeles"));
                    	return;
                    
                    } catch (NoSuchElementException e){
                    }
				}
	}
			

		
		
	
	


