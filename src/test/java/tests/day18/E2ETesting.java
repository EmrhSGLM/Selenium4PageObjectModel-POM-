package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class E2ETesting {

    //1. Tests packagenin altına class olusturun: CreateHotel
    //2. Bir metod olusturun: createHotel
    //3. https://www.hotelmycamp.com adresine git.
    //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
    //    a. Username : manager
    //    b. Password  : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna tıklayın.
    //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.

    @Test
    public void createHotel(){
        HotelMyCampPage hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.girisYap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCamp.bekle(3);
        hotelMyCamp.hotelManagementLink.click();
        hotelMyCamp.hotelListLinki.click();
        hotelMyCamp.addHotelLinki.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(hotelMyCamp.addHotelCodeBox).
                sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().country()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(faker.internet().emailAddress()).perform();
        Select select = new Select(hotelMyCamp.addHotelTypeDropdownBox);
        select.selectByIndex(1);

        //8. Save butonuna tıklayın.
        hotelMyCamp.saveButton.click();

        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.



    }
}
