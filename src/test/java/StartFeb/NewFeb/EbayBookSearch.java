package StartFeb.NewFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayBookSearch {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijender Kumar\\eclipse-workspace\\NewFeb\\driver\\chromedriver.exe");

		/*
		 * ChromeOptions options = new ChromeOptions(); WebDriver driver = new
		 * ChromeDriver(options);
		 */
        // Open eBay
    	ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");


        try {
            // Open eBay
            driver.get("https://www.ebay.com");

            // Find the search bar and enter the search term
            WebElement searchBar = driver.findElement(By.id("gh-ac"));
            searchBar.sendKeys("books");
            searchBar.sendKeys(Keys.RETURN);

            // Wait for the results to load and click on the first item
            Thread.sleep(5000);  // Wait for 5 seconds for the elements to be ready
            WebElement firstItem = driver.findElement(By.xpath("//*[@id=\"item5a5124da6c\"]"));
           
            String xpathvalue = String.format("//*[@id=\"item5a5124da6c\"]");
			String nthBooksearchnumber = driver.findElement(By.xpath(xpathvalue)).getText();
			System.out.println(nthBooksearchnumber);
			 firstItem.click();

            // Wait for the item page to load
            Thread.sleep(5000);  // Wait for 5 seconds for the item page to load

            // Find and click the "Add to cart" button
            WebElement addToCartButton = driver.findElement(By.id("atcRedesignId_btn"));
            addToCartButton.click();

            // Wait for the cart overlay to appear and click the "Go to cart" button
            Thread.sleep(5000);  // Wait for 5 seconds for the cart overlay to appear
            WebElement goToCartButton = driver.findElement(By.id("gh-cart-n"));
            goToCartButton.click();

            // Wait for the cart page to load
            Thread.sleep(5000);  // Wait for 5 seconds for the cart page to load

            // Verify that the item has been added to the cart
            WebElement cartItem = driver.findElement(By.xpath("//div[contains(@class, 'cart-bucket')]//a[contains(@class, 'item-title')]"));
            if (cartItem.getText().toLowerCase().contains("book")) {
                System.out.println("Item successfully added to the cart!");
            } else {
                System.out.println("Item not found in the cart.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            // driver.quit();
        }
    }
}
