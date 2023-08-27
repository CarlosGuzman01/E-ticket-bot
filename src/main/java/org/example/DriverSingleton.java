package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static WebDriver onlyDriver;

    private DriverSingleton(){

    }

    public static WebDriver getInstance(){
        if(onlyDriver == null){

            onlyDriver = new ChromeDriver();
        }
        return onlyDriver;
    }

    public static void closeInstace(){
       if(onlyDriver != null){
           onlyDriver.quit();
       }
    }


}
