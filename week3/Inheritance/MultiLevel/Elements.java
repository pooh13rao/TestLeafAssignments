package assignments.week3.Inheritance.MultiLevel;

public class Elements extends Button {

	public static void main(String[] args) {

		// creating objects for all sub classes and calling the respective methods

		Button button = new Button();
		button.setText("--- Button Element ----");
		button.click();
		button.submit();
		TextField text = new TextField();
		text.setText("----Text Field Element---- ");
		text.click();
		text.getText();

		CheckBoxButton CB = new CheckBoxButton();

		CB.setText("----Check Box Element----");
		CB.click();
		CB.clickCheckButton();
		CB.submit();

		RadioButton RB = new RadioButton();
		RB.setText("----Radio Button Element----");
		RB.click();
		RB.selectRadioButton();
		RB.submit();
	}

}
