package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.SubmitReviewPage;

public class SubmitReviewTest extends TestBase{

	@Test
	public void init() throws Exception {
		
//		driver.get("https://www.tripadvisor.in/");
		SubmitReviewPage reviewpage = PageFactory.initElements(driver,SubmitReviewPage.class);
		reviewpage.ClickOnSearchBox();
		reviewpage.SendValue("CLUB MAHINDRA");
		reviewpage.SearchButtonClick();
		reviewpage.SelectFirstName();
		reviewpage.SwitchToNewWindow();
		reviewpage.ScrollDown();
		Thread.sleep(3000);
		reviewpage.WriteReview();
		reviewpage.SwitchToChildWindow();
		reviewpage.FiveStarRating();
		Thread.sleep(3000);
		reviewpage.TitleName("Good environment and Awesome food");
		reviewpage.ReviewDetails("First time we went this place,awesome place for one day trip with friends and nice food, "
				+ "We chose to holiday during the last week of 2019 December- peak season. Our good experiences during the "
				+ "same were limited. The resort in general has a rather laid-back air about it- often extending to the "
				+ "services offered. While the campus is rather spacious and offers interesting amenities, they appear to "
				+ "under-staffed or unable to use their space appropriately, resulting in waiting lines during meal times etc. "
				+ "In a sharp contrast, the Barbecue restaurant offers the best service on campus. The staff at this particular"
				+ " restaurant are extremely attentive and really look after the customers' needs.");
		Thread.sleep(3000);
		reviewpage.SortTrip();
		reviewpage.Scrollslowly();
		reviewpage.SelectDropDownValue("December 2019");
		reviewpage.ScrollSubmitButton();
		Thread.sleep(3000);
		reviewpage.ClickCheckBox();
		Thread.sleep(3000);
		reviewpage.SubmitButton();	
	}
	
}
