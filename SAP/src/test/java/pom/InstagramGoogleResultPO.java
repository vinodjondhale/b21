package pom;

public class InstagramGoogleResultPO {
	package testScripts;

	//import static org.testng.Assert.fail;

	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import Library.BaseTest;
	import POM.Link1PO;

	public class Test1 extends BaseTest{
		@Test
		public void testGoogleLink() {
			try {
				Link1PO link1po=new Link1PO(driver);
				link1po.myGoogleLink().click();
				String aTitle=driver.getTitle();
				String eTitle="Google";
				Assert.assertEquals(aTitle, eTitle);
					
			}catch(Exception e) {
				Reporter.log("Exception generated", true);
				Assert.fail();
			}
			
		}

	}



}
