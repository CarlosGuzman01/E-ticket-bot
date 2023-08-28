//the hyperlink that this class gets done: https://eticket.migracion.gob.do/Auth/TravelRegister/

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SecondHyperlink {

    public static void goToNextHyperlink() throws InterruptedException {

        boolean alone;

        //method that checks if the user is traveling alone or not, I need to change this later so that it works with javaFX
        alone = areYouTravelingAlone();

        //method that check the number of people, I need to change this later so that it works with javaFX
        getNumberOfPeopleTraveling(alone);

        //method that helps me do the captcha
        doCaptcha();

        //click "submit"
        DriverSingleton.getInstance().findElement(By.id("btnSumbit")).click();




    }

    //method that checks if the user is traveling alone or not, I need to change this later so that it works with javaFX
    private static boolean areYouTravelingAlone(){
        boolean alone = false;

        if(!alone){
            DriverSingleton.getInstance().findElement(By.xpath("//label[normalize-space()='NO']")).click();
        }

        return alone;

    }

    //method that check the number of people, I need to change this later so that it works with javaFX
    private static void getNumberOfPeopleTraveling(boolean alone){
        if(!alone){
            int numberOfPeople = 2 - 1;
            String finalNumberOfPeople = String.valueOf(numberOfPeople);

            if(numberOfPeople > 0 && numberOfPeople < 7){

                DriverSingleton.getInstance().findElement(By.id("AcompanyNumber")).clear();
                DriverSingleton.getInstance().findElement(By.id("AcompanyNumber")).sendKeys(finalNumberOfPeople);

                //method that gets the nature of the group
                getNatureOfTheGroup();



            }

        }else{

        }

    }

    //method that gets the nature of the group
    private static void getNatureOfTheGroup(){

        Select drop = new Select(DriverSingleton.getInstance().findElement(By.name("Relation")));
        drop.selectByIndex(3);




    }
    //method that helps me do the captcha
    private static void doCaptcha() throws InterruptedException {
    int seconds = 25;

    Thread.sleep(seconds * 1000);


    }





}
