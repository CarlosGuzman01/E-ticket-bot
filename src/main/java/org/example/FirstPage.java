//the hyperlink that this class gets done: https://eticket.migracion.gob.do/

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FirstPage {

    public static void  goToNextHyperLink(){

        //going to the eticket website
        DriverSingleton.getInstance().get("https://eticket.migracion.gob.do");

        //Setting the language to english
        Select drop;
        drop = new Select(DriverSingleton.getInstance().findElement(By.name("culture")));
        drop.selectByVisibleText("ENGLISH");

        //click "e-ticket application"
        DriverSingleton.getInstance().findElement(By.id("request_ticket_btn")).click();

        //click "New eTicket"
        DriverSingleton.getInstance().findElement(By.cssSelector("button[class='swal2-confirm swal2-styled swal2-default-outline']")).click();









    }

}
