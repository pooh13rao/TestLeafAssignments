package assignments.week3.Abstraction;

public abstract class MySqlConnection implements DatabaseConnection{
	public void executeQuery() {
		System.out.println( "Executing MySql DB Query");
		
	}

}
