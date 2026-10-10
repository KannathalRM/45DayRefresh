package Kite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kite {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions b=new ChromeOptions();
	b.addArguments("--incognito");
	b.addArguments("--disable-notifications");
	WebDriver a= new ChromeDriver(b);
	a.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	a.manage().window().maximize();
	a.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=677743576480&hvpos=&hvnetw=g&hvrand=1415719949029810529&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000928&hvtargid=kwd-360364908397&ref=pd_sl_2g3jlg2slz_e&hydadcr=20061_13508849&gad_source=1");
	Thread.sleep(5000);
	a.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	a.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	WebElement item = a.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
	Actions a1=new Actions(a);
	a1.contextClick(item).perform();
	Robot robot = new Robot();
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
//
robot.keyRelease(KeyEvent.VK_ENTER);
//}
}
}