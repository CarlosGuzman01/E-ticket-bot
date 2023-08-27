package org.example;

import org.openqa.selenium.support.ui.Select;

public class ElementSingleton {

    private static Select onlySelect;

    private ElementSingleton(){

    }

    public static Select getInstance(String id){
        if(onlySelect == null){
            onlySelect = new Select()
        }
    }

}
