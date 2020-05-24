package DockerGridimplementation.DockerGridimplementation;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DockerHooks {

	@BeforeTest
	public static void BeforeTest() throws IOException, InterruptedException {
		String[] command = {"cmd.exe", "/c",System.getProperty("user.dir")+"\\Start_DockerServer.bat"};
		Runtime.getRuntime().exec(command);
		Thread.sleep(5000);
	}
	
	@AfterTest
	public static void AfterTest() throws IOException, InterruptedException {
		String[] command = {"cmd.exe", "/c",System.getProperty("user.dir")+"\\End_DockerServer.bat"};
		Runtime.getRuntime().exec(command);
	}
}
