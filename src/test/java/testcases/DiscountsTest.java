package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddDiscountsPage;
import pages.EditDiscountPage;
import util.DataProviderClass;

public class DiscountsTest extends BaseTest {

	/*
	 * MenuPage menu;
	 * 
	 * @BeforeMethod public void handleMenu() { menu = new MenuPage(driver); }
	 */

	@Test(dataProvider = "discountData", dataProviderClass = DataProviderClass.class, groups = "functional")
	// @Test(groups = "functional")
	public void addDiscountTest(String discountName, String discountType, String discountPercentage, String startDate,
			String endDate) {

		/*
		 * if (!DataUtil.isTestExecutable(eat,
		 * Thread.currentThread().getStackTrace()[1].getMethodName())) { throw new
		 * SkipException("Skipping Testcase as the RUNMODE is N."); }
		 */

		AddDiscountsPage addDiscountsPage = menu.expandPromotionsTree().navigateToDiscountsPage()
				.navigateToAddDiscountsPage();
		// addDiscountsPage.addDiscount();
		addDiscountsPage.addDiscount(discountName, discountType, discountPercentage, startDate, endDate);
	}

	@Test(groups = "smoke")
	public void searchDiscountTest() {

		/*
		 * if (!DataUtil.isTestExecutable(eat,
		 * Thread.currentThread().getStackTrace()[1].getMethodName())) { throw new
		 * SkipException("Skipping Testcase as the RUNMODE is N."); }
		 */

		menu.expandPromotionsTree().navigateToDiscountsPage().searchDiscount();
	}

	@Test(groups = "functional")
	public void editExistingDiscountTest() {

		/*
		 * if (!DataUtil.isTestExecutable(eat,
		 * Thread.currentThread().getStackTrace()[1].getMethodName())) { throw new
		 * SkipException("Skipping Testcase as the RUNMODE is N."); }
		 */

		EditDiscountPage editDiscountPage = menu.expandPromotionsTree().navigateToDiscountsPage().searchDiscount()
				.editDiscountButton();
		editDiscountPage.editDiscount();
	}

	/*@DataProvider // (name = "data")
	public Object[][] discountData() {
		return new Object[][] { new Object[] { "selenium" }, new Object[] { "3" }, new Object[] { "20" },
				new Object[] { "11/4/2019 12:00 AM" }, new Object[] { "11/5/2019 12:00 AM" } };
	}*/

	/*@DataProvider // (name = "data1")
	public Object[][] data() {
		Object[][] data = new Object[1][5];

		data[0][0] = "selenium";
		data[0][1] = "3";
		data[0][2] = "20";
		data[0][3] = "11/4/2019 12:00 AM";
		data[0][4] = "11/5/2019 12:00 AM";

		/*
		 * data[1][0] = "FName2"; data[1][1] = "LName2"; data[1][2] = "Email2";
		 * 
		 * data[2][0] = "FName3"; data[2][1] = "LName3"; data[2][2] = "Email3";
		 */

		//return data;
	//}*/

}