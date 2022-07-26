package com.bugreportrepro.Controller;

import com.microsoft.playwright.*;
import javafx.event.ActionEvent;

import java.util.concurrent.TimeUnit;

public class StartButton {
    static Playwright playwright = Playwright.create();
    static Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    public static BrowserContext bx1 = browser.newContext();

    private static String username = "Username";
    private static String password = "Password";
    public void toggleAction29(ActionEvent actionEvent) throws InterruptedException {
        Page page1 = bx1.newPage();
        if (!page1.title().equals("Microsoft – Cloud, Computers, Apps & Gaming")) {
            page1.navigate("https://www.microsoft.com/en-us");
            page1.locator("xpath=//input[@type='email']").fill(username);
            page1.locator("xpath=//input[@type='password']").fill(password);
            page1.keyboard().press("Enter");
            TimeUnit.SECONDS.sleep(60);
        }
    }
}