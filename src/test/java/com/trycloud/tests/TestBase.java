package com.trycloud.tests;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod
    public void setup(){
        String url= ConfigurationReader.getProperty("trycloudurl");
        Driver.getDriver().get(url);
    }
    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(3);
        Driver.getDriver().close();
    }
}
