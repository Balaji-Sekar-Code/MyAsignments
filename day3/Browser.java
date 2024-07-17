package week1.day3;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("BrowserLaunched Successfully");
		return browserName;
		
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bro = new Browser();
		System.out.println(bro.launchBrowser("Chrome"));
		bro.loadUrl();

	}

}
