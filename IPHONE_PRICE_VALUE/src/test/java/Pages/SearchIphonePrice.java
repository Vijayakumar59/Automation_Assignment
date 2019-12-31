package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchIphonePrice {
	
	 WebDriver driver; 
	 String FpkartPriceValue;
	 String AmazonPriceValues;
	 
	 public SearchIphonePrice(WebDriver driver) {
		 this.driver = driver;
	 }
	 
//   Using FindBy for locating elements 
//	 flipkart
	 @FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _29YdH8']") WebElement Close;
	 @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for products, brands and more']") WebElement SearchPhone;
	 @FindBy(how = How.XPATH, using = "//button[@class='vh79eN']") WebElement ClickButton;
	 @FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"
	 		                        + "/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]") WebElement PriceValue;
	 
//	 Amazon
	 @FindBy(how = How.XPATH, using  = "//input[@id='twotabsearchtextbox']") WebElement AmazonSearchBox;
	 @FindBy(how = How.XPATH, using = "//div[@class='nav-search-submit nav-sprite']") WebElement AmazonSearchButton;
	 @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div[1]/div[1]"
				                       + "/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"
				                       + "/a[1]/span[1]/span[2]/span[2]") WebElement AmazonPriceValue;
	 
//	 Flipkart Methods 
	 public void FlipkartSearchBox(String value) {
		 SearchPhone.sendKeys(value);
	 }
	 public void FlipkartSearchButton() {
		 ClickButton.click();
	 }
	 public void FlipkartClosebutton() {
			Close.click();
	 }
	 public void FlipkartGetPriceValue() {
		String FlipkartPriceValue = PriceValue.getText();
		FpkartPriceValue = FlipkartPriceValue.substring(1, 7);	
	 }
	 
//	 Amazon Methods
	 public void AmazonSearchValue(String str) {
	      AmazonSearchBox.sendKeys(str);		
	 }
		
	 public void AmazonButtonClick() {
			AmazonSearchButton.click();
	 }
	 public void AmazonSelectValue() {
			AmazonPriceValues = AmazonPriceValue.getText();	
	 }
	 
	 public void ComparePriceValue() {
		 int i = Integer.parseInt(FpkartPriceValue.replaceAll(",","").trim());
		 int j = Integer.parseInt(AmazonPriceValues.replaceAll(",","").trim());
		 System.out.println(i<j?i:j); 
	 }   
}


