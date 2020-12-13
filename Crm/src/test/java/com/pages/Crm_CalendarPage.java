package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crm_CalendarPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[2]/a/i")
	WebElement calendarIcon;
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement newBtn;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement title;
	@FindBy(xpath="//div[@name='calendar']")
	WebElement calDD;
	By calList = By.xpath("//div[@class='visible menu transition']/div[@role='option']");
			
	@FindBy(xpath="//input[@name='calendarName']")
	WebElement newCalName;
	@FindBy(xpath="//div[@class='ui small modal transition visible active']/div[3]/button[2]/i")
	WebElement newCalSave;
	@FindBy(xpath="//div[@class='visible menu transition']/div[4]/span")
	WebElement calName;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input")
	WebElement startDate;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/div/input")
	WebElement endDate;
	
	@FindBy(xpath="//div[@name='category']/i")
	WebElement categoryDD;
	@FindBy(xpath="//div[@class='visible menu transition']/div[@name='category']/span")
	List<WebElement>  categoryList;
	
	@FindBy(xpath="//div[@class='ui toggle checkbox']/input")
	WebElement allDayToggleBox;
	
	@FindBy(xpath="//div[@name='task']/input")
	WebElement task;
	@FindBy(xpath="//div[@name='task']/div/div/span")
	WebElement addTask;
	
	@FindBy(xpath="//div[@name='minutesBefore']/i")
	WebElement alertBefore;
	@FindBy(xpath="//div[@name='minutesBefore']/div[2]/div")
	List<WebElement> alertList;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")
	WebElement tag;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div/div/span")
	List<WebElement> tagList;
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div/div[@data-additional='true']/span")
	WebElement addTag;
	
	
	@FindBy(xpath="//div[@name='deal']/input")
	WebElement deal;
	@FindBy(xpath="//div[@name='deal']/div[2]/div/span")
	List<WebElement> dealList;
	@FindBy(xpath="//div[@name='deal']/div/div[@data-additional='true']/span")
	WebElement addDeal;
	
	@FindBy(xpath="//div[@name='company']/input")
	WebElement company;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//button[@class='ui linkedin button']/i")
	WebElement saveBtn;
	
	@FindBy(xpath="//textarea[@name='location']")
	WebElement location;
	
	@FindBy(xpath="//div[@name='case']/input")
	WebElement caseSearch;
	
	
	
	
	public Crm_CalendarPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCalIcon() {
		Actions action = new Actions(driver);
		action.click(calendarIcon).build().perform();
		//calendarIcon.click();		
	}
	public void clickOnNewBtn() {
		newBtn.click();
	}
	public void enterTitle(String titleName) {
		Actions action = new Actions(driver);
		action.moveToElement(title).build().perform();
		action.sendKeys(title, titleName).build().perform();
		//title.sendKeys(titleName);
	}
	/*public void enterNewCal(String calName) {
		calDD.click();
		List<WebElement> newList = driver.findElements(calList);
		int size = newList.size();
		int last=size-1;
		newList.get(last).click();
		newCalName.sendKeys(calName);
		newCalSave.click();
		
	}*/
	public void enterCalendarName() {
		calDD.click();
		calName.click();
	}
	public void enterStartDate(String sdate) {
		startDate.clear();
		startDate.sendKeys(sdate);
	}
//	public void enterEndDate(String edate) {
//		endDate.clear();
//		endDate.clear();
//		endDate.sendKeys(edate);
//	}
	public void selectCategory(String catName) {
		categoryDD.click();
		for (WebElement category : categoryList) {
			if(category.getText().equals(catName))
			{
				category.click();
			}
			
		}
		
	}
	public void clickOnAllDay() {
		if(!allDayToggleBox.isSelected()) {
			System.out.println("hellooo");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", allDayToggleBox);
			//allDayToggleBox.click();
			
		}
			
	}
	public void addTask(List<String> taskNames) {
		for (String taskName : taskNames) {
				
		task.sendKeys(taskName);
		task.sendKeys(Keys.ENTER);
	}
	}
	public void selectAlertTime(String time) {
		alertBefore.click();
		for (WebElement alert : alertList) {
			if(alert.getText().equals(time))
			{
				alert.click();
				break;
			}
			
		}
	}
	public void enteraTags(List<String> tagValues) throws Exception {
		for (String value : tagValues) {
			tag.sendKeys(value);
			tag.sendKeys(Keys.ENTER);

			
		}
		
	}
	public void enterDeals(List<String> dealValues) {
		for (String value : dealValues) {
			deal.sendKeys(value);
			deal.sendKeys(Keys.ENTER);
			
				}
	}
//	public void enterTagandDeal(String tagName, String dealName) {
//		
//		
//		
//		tag.sendKeys(tagName);
//		System.out.println(tagList.size());
//		for (WebElement tags : tagList) {
//			if(tags.getText().equals(tagName)) {
//				System.out.println(tags.getText());
//				tags.click();
//				break;
//			}
//			else 
//				addTag.click();
//		}
//		deal.sendKeys(dealName);
//		System.out.println(dealList.size());
//		for (WebElement deal1 : dealList) {
//			if(deal1.getText().equals(dealName)) {
//				//System.out.println("yes");
//				deal1.click();
//				break;
//			}
//			else
//				addDeal.click();
//			
//		}
//		
//		
//	}
	
	public void enterCompany(String companyName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		company.sendKeys(companyName);
		company.sendKeys(Keys.ENTER);
		
	}
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	public void enterDescription(String des) {
		description.sendKeys(des);
	}
	
	public void enterLocation(String loc) {
		location.sendKeys(loc);
	}
	public void enterCase(String caseName) {
		caseSearch.sendKeys(caseName);
		caseSearch.sendKeys(Keys.ENTER);
	}

}
