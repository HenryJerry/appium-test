//package com.dan.demo;
////导入包类
//import io.appium.java_client.AppiumDriver;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.io.File;
//import java.net.URL;
//import java.sql.Time;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import java.sql.Time;
////准备测试
//public class ContactsTest {
////初始化AppiumDriver
//private AppiumDriver driver;
//@Before
//public void setUp() throws Exception {
////设置APP路径
//File classpathRoot = new File(System.getProperty("user.dir"));
//File appDir = new File(classpathRoot,"apps");
//File app = new File(appDir, "YCMath345-iOS.app");
/////Users/sks/Library/Developer/Xcode/DerivedData/YCMath345-iOS-gswmmorclgkffeevdytydhjkdhjk/Build/Products/Debug-iphonesimulator/YCMath345-iOS.app
//System.out.println("设置路径完毕");
////设置自动化相关参数
//DesiredCapabilities capabilities = new DesiredCapabilities();
//capabilities.setCapability("appium-version", "1.1.0");
//capabilities.setCapability("platformVersion", "9.2");
//capabilities.setCapability("platformName", "ios");
//capabilities.setCapability("deviceName", "iPhone 6");
//System.out.println("设置自动化相关参数");
////设置apk路径
//capabilities.setCapability("app", app.getAbsolutePath());
////如果测试的是AndroidApp的话,需要设置app的主包名和主类名-------iOS可以省略
////  capabilities.setCapability("appPackage", "com.example.android.contactmanager");
////  capabilities.setCapability("appActivity", ".ContactManager");
////初始化 AppiumDriver
//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
////设置等待秒数
//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//System.out.println("初始化 AppiumDriver");
//}
//
////运行完成后
//@After
//public void tearDown() throws Exception{
////    driver.wait(12000);
//driver.quit();
//System.out.println("运行结束!!!!!!!");
//System.out.println("即将开启下一个Session");
//}
////------测试用例编写--------//
////Session One
//@Test
//public void AppiumTestOne() throws InterruptedException{
//System.out.println("Session One-First case-Start");
////driver.findElement(By.name("马上开始")).click();
////driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
////WebElement el = ((WebElement) driver.findElementsByIosUIAutomation("马上开始"));
////el.click();
//driver.findElement(By.name("马上开始")).click();
//System.out.println("点击马上开始!");
//driver.findElement(By.name("人教版")).click();
//System.out.println("点击人教版,选择教材!");
//driver.findElement(By.name("七年级上")).click();
//System.out.println("点击七年级上,选择年纪!");
//driver.findElement(By.name("引入")).click();
//System.out.println("点击引入,跳转到视频界面!");
//driver.findElement(By.name("yc coachmark")).click();
//System.out.println("点击蒙版,接下来播放视频");
//System.out.println("设置了线程休眠20秒....");
////线程睡眠,ms
//Thread.sleep(20000);
////driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//System.out.println("视频播放20秒后");
////driver.wait(10);
//System.out.println("Session One-First case-End!");
//}
//
////Session Two
//@Test
//public void AppiumTestTwo() throws InterruptedException{
//System.out.println("Session Two-first case-start");
////返回按钮
//driver.findElement(By.name("注册或登录")).click();
//System.out.println("点击注册或登录!");
//driver.findElement(By.name("学生")).click();
//System.out.println("点击button,身份为学生!");
////driver.findElement(By.name("手机号//邮箱")).sendKeys("15725040279");;
////System.out.println("输入手机号或邮箱--by.name");
//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("15725040279");;
//System.out.println("输入手机号或邮箱!");
//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("yulu83741319");
//System.out.println("输入密码!");
//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[5]/UIAKeyboard[1]/UIAButton[4]")).click();
//System.out.println("点击键盘完成输入!");
//driver.findElement(By.name("立即登录")).click();
//System.out.println("点击了,立即登录按钮.");
//Thread.sleep(10000);
//System.out.println("睡眠10秒");
//System.out.println("Session Two-first case-End!");
//}
//
//}



package com.dan.demo;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities; 

import java.io.File;  
import java.net.URL;  
import java.util.List;

 
public class ContactsTest {
    private AppiumDriver driver; 
    @Before
    public void setUp() throws Exception {
        //设置apk的路径
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "ContactManager.apk");
        
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        
        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "4.3");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        capabilities.setCapability("appActivity", ".ContactManager");
        
        //初始化
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);       
    }
 
    @Test
    public void addContact(){
        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
    }    
    
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
