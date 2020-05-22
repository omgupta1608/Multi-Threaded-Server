import java.util.*;
public class Main {
	
	private static String address;
	private static int port;
	
	public static void main(String[] args) {
		
		Server server = new Server(4500);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Address and the Port of the Server :");
		address = s.next();
		port = s.nextInt();
		
		Client c = new Client(address,port);
		
	}

}
