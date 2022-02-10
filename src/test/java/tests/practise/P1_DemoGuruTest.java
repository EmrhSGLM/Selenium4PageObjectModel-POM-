package tests.practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P1_DemoGuruTest {

    /*
        http://demo.guru99.com/test/drag_drop.html url e git
        DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
        CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
        Perfect butonun goruntulendigini dogrulayin
   */
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));

        DemoGuruPage demoGuruPage = new DemoGuruPage();

        Actions actions = new Actions(Driver.getDriver());
        actions.
                dragAndDrop(demoGuruPage.bankButon,demoGuruPage.accountBox).
                dragAndDrop(demoGuruPage.salesButon,demoGuruPage.account2Box).
                dragAndDrop(demoGuruPage.firstnum5000Butonu,demoGuruPage.amountBox).
                dragAndDrop(demoGuruPage.secondnum5000Butonu, demoGuruPage.amount2Box).
                sendKeys(Keys.PAGE_DOWN).
                perform();
        Thread.sleep(3000);
    }



}
