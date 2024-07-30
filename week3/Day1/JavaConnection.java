package week3.Day1;

public class JavaConnection implements DatabaseConnection{
	
	public static void main(String[] args) {
		
		JavaConnection java = new JavaConnection();
		
		java.connect();
		java.executeUpdate();
		java.disconnect();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DisConnected");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
		System.out.println("Updated");
	}
	
	

}
