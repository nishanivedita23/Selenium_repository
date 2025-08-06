package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_021_Test extends BaseClass {
	
	@Test
	public void onClickComputers() {
		HomePage hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","computers page is not displayed");
		test.log(Status.PASS, "computers Page is displayed");
	}
	

}
