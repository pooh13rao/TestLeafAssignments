package assignments.week3.Inheritance.Single;

public class LoginTestData extends TestData {
	// Method to enter username
	public void enterUsername() {
		System.out.println("Entering username...");
	}

	// Method to enter password
	public void enterPassword() {
		System.out.println("Entering password...");
	}
	
	public static void main(String[] args) {
     
		// Create an instance of TestData
        TestData test = new TestData();
        test.enterCredentials();
        test.navigateToHomePage();
        
        
        // Create an instance of LoginTestData
        LoginTestData login = new LoginTestData();
        login.enterCredentials(); 
        login.navigateToHomePage();
        login.enterUsername();
        login.enterPassword();
    }

}
