//the hyperlink that this class gets done: https://eticket.migracion.gob.do/Auth/TravelRegister/

package org.example;

import org.openqa.selenium.By;

public class SecondHyperlink {

    public static void goToNextHyperlink(){

        boolean alone;

        alone = areYouTravelingAlone();
        getNumberOfPeopleTraveling(alone);


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

            }

        }else{

        }

    }


}
