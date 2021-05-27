package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy Search Smoke Test----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---Etsy Search Smoke Test completed-Pass-");

    }

    private static void openBrowser() {
        System.out.println("Launching Chrome browser.");
    }

    private static void navigateToEtsyUrl() {
        System.out.println("Navigating https://www.etsy.com/ ");
    }

    private static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed.");
        System.out.println("Type Wooden Spoon in search box and click search");
    }

    private static void verifyResultsAreDisplayed() {
        System.out.println("PASS:Search results are displayed correctly..");
    }
}
