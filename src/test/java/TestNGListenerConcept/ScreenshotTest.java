package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//how exactly,this particular class will get to know that it has to listen some listener so
//we have to add one annotation @Listener(listener.class),we have to tell from which class you have t listen.
@Listeners(CustomListener.class) 
public class ScreenshotTest extends TestBase {
	
	@BeforeMethod 
	public void setUp() {
		initialization();
	}
	
	
	@Test
	public void loginTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void serachTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void createContactTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void homePageTest() {
		Assert.assertEquals(false, true);
	}
	
	
	
	
	
	/*@Test
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void takeScreenshotTest3() {
		Assert.assertEquals(false, true);
	}
*/	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
