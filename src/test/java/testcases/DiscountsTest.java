package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddDiscountsPage;
import pages.EditDiscountPage;

public class DiscountsTest extends BaseTest {

	/*MenuPage menu;

	@BeforeMethod
	public void handleMenu() {
		menu = new MenuPage(driver);
	}*/

	@Test
	public void addDiscountTest() {
		AddDiscountsPage addDiscountsPage = menu.expandPromotionsTree().navigateToDiscountsPage()
				.navigateToAddDiscountsPage();
		addDiscountsPage.addDiscount();
	}

	@Test
	public void searchDiscountTest() {
		menu.expandPromotionsTree().navigateToDiscountsPage().searchDiscount();
	}

	@Test
	public void editExistingDiscountTest() {
		EditDiscountPage editDiscountPage = menu.expandPromotionsTree().navigateToDiscountsPage().searchDiscount()
				.editDiscountButton();
		editDiscountPage.editDiscount();
	}

}