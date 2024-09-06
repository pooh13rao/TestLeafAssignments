package assignments.week3.Polymorphism;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		//Overriding performCommonTasks();
		System.out.println("Overriding the common tasks");
	}
	
	public static void main(String[] args) {
		BasePage base = new BasePage();
		
		base.findElement();
		base.clickElement();
		base.enterText();
		base.performCommonTasks();
		
		
		System.out.println("------- Login Page --------");
		LoginPage login = new LoginPage();
		login.findElement();
		login.clickElement();
		login.enterText();
		login.performCommonTasks();
		
	}

}
