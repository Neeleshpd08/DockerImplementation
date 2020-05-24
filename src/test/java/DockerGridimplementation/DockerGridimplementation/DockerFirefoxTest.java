package DockerGridimplementation.DockerGridimplementation;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerFirefoxTest {
	
	@Test
	public void ChromeTest() throws MalformedURLException {
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
