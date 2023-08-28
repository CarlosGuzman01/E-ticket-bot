//the hyperlink that this class gets done: https://eticket.migracion.gob.do/TravelTicket/StepOne

package org.example;

import org.openqa.selenium.By;

import java.sql.Driver;

public class ThirdHyperlink {

    //code of the eticket application, I have to print this at the end
    public static String appCode = DriverSingleton.getInstance().findElement(By.xpath("//span[@class='font-weight-bold']")).getText();

    public static void goToNextHyperlink() {



    }




}
