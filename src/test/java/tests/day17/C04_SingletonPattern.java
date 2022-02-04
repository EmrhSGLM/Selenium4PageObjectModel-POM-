package tests.day17;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.Driver;


public class C04_SingletonPattern {

    @Test
    public void test01(){

        // Singleton pattern : Bir class'dan birden fazla obje uretilmesine
        // izin vermeyen bir pattern olarak kabul gormustur.

        // Biz Driver class'ini drşver uretmek uzere kullaniyoruz
        // ancak Driver class'indan driver isminde bir instance variable da var
        // ve biz obje ureterek bu instance driver'a olusabiliriz

        //Driver driver1=new Driver();
        //Driver driver2=new Driver();
        //Driver driver3=new Driver();


        // Singleton pattern kabul gormus bir pattern dir
        // Amac bir class'dan obje uretilmemesini saglamaktir
        // Bunun icin singleton pattern'de koruyacagimiz class'da
        // parametresiz bir consructor olusturur ve
        // bu constructor'i private yapariz



    }
}
