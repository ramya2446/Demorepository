package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepackage.Baseclass;
public class Loginpage {
	final WebDriver driver;
	

		
		public Loginpage(WebDriver driver) {
			//super();
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
			
			
			
			@FindBy(xpath="//*[@class='ltkpopup-email']")
			private   WebElement codemail;
			
			@FindBy(xpath="//*[@class='ltkpopup-subscribe']")
			private WebElement code;
			
			
			@FindBy(xpath="//*[@class='ltkpopup-close ltkpopup-close-button']")
			private WebElement close;
			
			@FindBy(xpath="//*[@class='btn-group dropdown-group']")
			private WebElement Mousehover;
			
			@FindBy(xpath="//header/div[2]/div[4]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]")
			private WebElement signin;
			
			@FindBy(xpath="//*[@name='dwfrm_login_username']")
			private WebElement email;
			
			@FindBy(xpath="//*[@id='dwfrm_login_password']")
			private WebElement Password;
			
			@FindBy(xpath="//*[@class='global pop-up']")
			private WebElement login;
			
			@FindBy(xpath="//*[@class='LPMlabel']")
			private WebElement Livechat;
			
			@FindBy(xpath="/html[1]/body[1]/div[32]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
			private WebElement name;
			
			@FindBy(xpath="/html[1]/body[1]/div[31]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
			private WebElement emailaddress;
			
			@FindBy(xpath="//button[contains(text(),'Submit')]")
			private WebElement submit;
			
			//@FindBy(xpath="//*[@class='lpc_maximized-header__close-button-asset lpc_desktop']")
			//private WebElement closetab;
			

			@FindBy(xpath="//*[@class='simplesearchinput valid']")
			private WebElement searchbar;
			
			@FindBy(xpath="/html[1]/body[1]/div[4]/div[2]/header[1]/div[3]/div[2]/ul[1]/li[1]/a[1]/span[1]")
			private WebElement Mouseover;
			
			
			@FindBy(xpath="//header/div[3]/div[2]/ul[1]/li[1]/ul[1]/li[1]/div[1]/span[1]/a[1]")
			private WebElement ceilingclick;
			
			@FindBy(xpath="//span[contains(text(),'Chandeliers')]")
			private WebElement chandler;
			
			@FindBy(xpath="//span[contains(text(),'Large Chandeliers')]")
			private WebElement largechandlier;
			
			@FindBy(xpath="//input[@class='fa-check-wc']")
			private WebElement checkbox;
			
			@FindBy(xpath="//a[contains(text(),'Independent Large Chandelier by Capital - OPEN BOX')]")
			private WebElement selectitem;
			
			@FindBy(xpath="//button[@id='add-to-cart']")
			private WebElement addtocart;
			
			@FindBy(xpath="/html[1]/body[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
			private WebElement closepopup;
			
			@FindBy(xpath="//header/div[2]/div[4]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]")
			private WebElement cartmouse;
			

			@FindBy(xpath="//a[contains(text(),'VIEW CART')]")
			private WebElement viewcart;
			

			@FindBy(xpath="//body[1]/div[3]/div[5]/div[2]/div[2]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/span[1]")
			private WebElement minus;
			
			



			@FindBy(xpath="//a[contains(text(),'Sign Out')]")
			private WebElement signout;
			
			public WebElement getSignout() {
				return signout;
			}

			
			
			public WebElement getMinus() {
				return minus;
			}

			public WebElement getViewcart() {
				return viewcart;
			}

			public WebElement getCartmouse() {
				return cartmouse;
			}

			public WebElement getClosepopup() {
				return closepopup;
			}

			public WebElement getAddtocart() {
				return addtocart;
			}

			public WebElement getSelectitem() {
				return selectitem;
			}

			public WebElement getCheckbox() {
				return checkbox;
			}

			public WebElement getLargechandlier() {
				return largechandlier;
			}

			public WebElement getChandler() {
				return chandler;
			}
			
			public WebElement getCeilingclick() {
				return ceilingclick;
			}
			public WebElement getMouseover() {
				return Mouseover;
			}
			public WebElement getSearchbar() {
				return searchbar;
			}
			//public WebElement getClosetab() {
				//return closetab;
			//}
			public WebElement getSubmit() {
				return submit;
			}
			public WebElement getEmailaddress() {
				return emailaddress;
			}
			public WebElement getName() {
				return name;
			}
			public WebElement getLogin() {
				return login;
			}
			public WebElement getClose() {
				return close;
			}
			public WebElement getCode() {
				return code;
			}

			public  WebElement getCodemail() {
				return codemail;
			}
			

			public WebElement getEmail() {
				return email;
			}
			

			public WebElement getMousehover() {
				return Mousehover;
			}
			
			
			public WebElement getSignin() {
				return signin;
			}


			public WebElement getPassword() {
				return Password;
			}

            public WebElement getLivechat() {
				return Livechat;
			}
			
			
			
			
		}
	 
	    


