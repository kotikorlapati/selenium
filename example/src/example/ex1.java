package example;



	
		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
		public class ex1 {
			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				ChromeDriver x=new ChromeDriver();
				x.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
				Thread.sleep(2000);
				if(x.getTitle().equals("Facebook – log in or sign up")){
				System.out.println("home page dispalyed");
					
				}
				else{
					System.out.println("failed to display home page");
					return;
				}
			 WebElement objFORGET=x.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));
			  objFORGET.click();
			    if(x.getTitle().equals("Forgotten Password | Can't Log In | Facebook")){
			   	System.out.println("forgete page dspalejh");
			    	
			    }else{
			    	System.out.println("not displayed");
			   }
			    WebElement objPHONE=x.findElement(By.xpath("//*[@id='identify_email']"));
			    WebElement objSEARCH=x.findElement(By.name("did_submit"));
			  
			    if(objPHONE.isDisplayed()){
			    	System.out.println("phone is displayed");
			    }
			    if(objSEARCH.isDisplayed()){
			    	System.out.println("search is displayed");
			    }
		        objPHONE.sendKeys("9030213556");
			    objSEARCH.click();
			    Thread.sleep(3000);
			    if(x.getTitle().equals("Forgotten Password | Can't Log In | Facebook")){
			    	System.out.println("displayed");
			    }
			    WebElement objBACK=x.findElement(By.name("go_back"));
			    objBACK.click();
			    Thread.sleep(2000);
			    if(x.getTitle().equals("Forgotten Password | Can't Log In | Facebook")){
			    	System.out.println("pgg displayed");
			    }
			    WebElement objCANCEL=x.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[3]/div/div[1]/a/span"));
			    objCANCEL.click();
			    if(x.getTitle().equals("Log in to Facebook | Facebook")){
			    	System.out.println("page title dispalyaed");
			    }else{
			    	System.out.println("not displayed");
			    }
			    Thread.sleep(2000);
			    WebElement objUN=x.findElement(By.xpath("//*[@id='email']"));
			    WebElement objPWD=x.findElement(By.xpath("//*[@id='pass']"));
			    WebElement objLOGIN=x.findElement(By.xpath("//*[@id='loginbutton']"));
			    //WebElement objFORGET=x.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));
			    if(objUN.isDisplayed()){
			    	System.out.println("un is dispalyed");
			    }
			    if(objPWD.isDisplayed()){
			    	System.out.println("pwd is dispalyed");
			    }
			    if(objLOGIN.isDisplayed()){
			    	System.out.println("login is dispalyed");
			    }
			    String sUN="9030213556";
			    String sPWD="koti@143";
			    objUN.clear();
			    objUN.sendKeys(sUN);
			    objPWD.clear();
			    objPWD.sendKeys(sPWD);
			    objLOGIN.click();
			    WebElement objPOPUP1=x.findElement(By.xpath("//*[@id='content']/div/div"));
				   if(objPOPUP1.isDisplayed()){
					   System.out.println("incjhghgjorrect passwijfu");
				   }
			    
			    WebElement objPOPUP=x.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div"));
				   if(objPOPUP.isDisplayed()){
					   System.out.println("incorrect passwijfu");
				   }
			  Thread.sleep(4000);
			    if(x.getTitle().equals("Facebook"))
			    {
					   System.out.println("page displayed");
					   
				   }
				   else{
					   System.out.println("page is not displayed");
					   
				   }
			    Actions A=new Actions(x);
			    Thread.sleep(2000);
			    A.moveToElement(x.findElement(By.xpath("//*[@id='userNavigationLabel']"))).click().perform();
			    System.out.println("settings open");
			    Thread.sleep(2000);
			    WebDriverWait wait=new WebDriverWait(x,60);
			    JavascriptExecutor js = (JavascriptExecutor)x;	
			    js.executeScript("arguments[0].click();",   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='_w0d _w0d']"))));
			    x.close();
			    x.quit();
			    }
		
		


		}
		