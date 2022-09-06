import org.junit.jupiter.api.Test;
import pages.PageWithImageResults;
import pages.PageWithImageResultsAndChosenImage;
import pages.PageWithLinkResults;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchAndPrintLinksTest extends BaseTest {

    @Test
    void shouldSearchForMyNameAndDownloadThirdImageTest(){
        // 2. Ввести имя-фамилию:
        PageWithLinkResults pageWithLinkResults = searchMainPage.searchFor("Александр Наумов");

        //3. Сохранить ссылки в консоль
        pageWithLinkResults.printAllLinksToConsole();
    }
}