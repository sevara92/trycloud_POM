package com.trycloud.tests;

import com.trycloud.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends LoginPage {

    @Test(description = "user_should_be_login_into_the_TryCloud_webPage")

    public void test1(){
        LoginPage login=new LoginPage();
        login.loginMethod("User72","Userpass123");
    }
}
