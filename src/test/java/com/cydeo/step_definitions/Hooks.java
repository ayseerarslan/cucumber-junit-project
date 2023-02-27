package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create "pre" and "post" condition for All the SCENARIOS and even STEPS
 */
public class Hooks {

    @Before
    public void setupMethod(){
        System.out.println("--> @Before: RUNNING BEFORE EACH SCENARIO");

    }

    @After
    public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("--> @After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();
    }

//    @BeforeStep
//    public void setUpStep(){
//        System.out.println("---> @BeforeStep : Running before each step!");
//
//    }
//
//    @AfterStep
//    public void tearDownStep(){
//        System.out.println("---> @AfterStep : Running after each step!");
//
//    }

}
