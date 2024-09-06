package assignments.week3.Abstraction;

public interface DatabaseConnection {
	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();


}
