package assignments.week3.Abstraction;

public class JavaConnection2 extends MySqlConnection {		

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
		JavaConnection2 java = new JavaConnection2();
		java.connect();
		java.executeUpdate();
		java.executeQuery();
		java.disconnect();
	}
	}


