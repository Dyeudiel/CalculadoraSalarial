package com.tcs.practica.reto.drivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OwnWebDriver {

	private WebDriver driver;

	private static List<OwnWebDriver> listOwnWebDriver = new ArrayList<>();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static OwnWebDriver withChrome() {
		String downloadPath = "";
		int timeOut = 20;

		ChromeOptions chromeOptions = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap();
		chromePrefs.put("download.default_directory", downloadPath);
		chromeOptions.addArguments("--start-Minimize");
		chromeOptions.setExperimentalOption("prefs", chromePrefs);

		listOwnWebDriver.add(new OwnWebDriver());
		listOwnWebDriver.get(listOwnWebDriver.size() - 1).driver = new ChromeDriver(chromeOptions);
		listOwnWebDriver.get(listOwnWebDriver.size() - 1).driver.manage().timeouts().implicitlyWait(timeOut,
				TimeUnit.SECONDS);
		return listOwnWebDriver.get(listOwnWebDriver.size() - 1);

	}

	public WebDriver enLaURL(String url) {
		driver.get(url);
		return listOwnWebDriver.get(listOwnWebDriver.size() - 1).driver;
	}

	public static WebDriver getBrowser() {
		return listOwnWebDriver.get(listOwnWebDriver.size() - 1).driver;
	}

}
