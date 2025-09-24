package com.nileshpatil.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab48_DDT_TestNG_POI {

    @Test(dataProvider = "getdata")
    public void test_vwo_login(String username,String password , String ER){
        System.out.println("Running");
        System.out.println(username + " - " + password + " - " +ER);
        System.out.println();

    }
    @DataProvider
    public Object[][] getdata(){
        // Read from the excel file
        // convert this into the 2d array Object
        // return that array
        return null;
    }

}
