import java.util.*;

public class Main {
	
	private static String address;
	private static int port;
	
	public static void main(String[] args) {
		
		
		
		Server server = new Server(9000);
		new Thread(server).start();

		try {
    		Thread.sleep(5 * 1000);
    		
		} catch (InterruptedException e) {
		
    		e.printStackTrace();
		}
		System.out.println("Stopping Server");
		
		server.stop();
		 /*
		
		Server server = new Server(4500);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Address and the Port of the Server :");
		address = s.next();
		port = s.nextInt();
		
		Client c = new Client(address,port);
		
		Server sd = new Server(1313);
*/		
	}

}
