package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageWithLinkResults extends PageWithResults {

    @FindBy(tagName = "a")//(xpath = "//div[@class='iUh30 qLRx3b tjvcx']")
    private List<SelenideElement> links;


    public void printAllLinksToConsole() {
        for (SelenideElement x : links) {
            String getLinks = x.getAttribute("href");
            System.out.println(getLinks);
        }

    }
}