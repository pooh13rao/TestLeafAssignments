package assignments.week3.Abstraction;

public class JavaConnection implements DatabaseConnection {		

	public void connect() {
		System.out.println("DataBase Connected");
	}
	public void disconnect() {
		System.out.println("DataBase Disconnected");

	}
	public void executeUpdate() {
		System.out.println("DataBase Updated");
	}
	
	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.executeUpdate();
		java.disconnect();
	}
	}


