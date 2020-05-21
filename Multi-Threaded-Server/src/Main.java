import java.util.*;
public class Main {
	
	private static String address;
	private static int port;
	
	public static void main(String[] args) {
		
		Server server = new Server(4500);
		System.out.println("Hello There!\nWhat are you?\n1.Client\n2.Server\nChoose One : ");
		Scanner s = new Scanner(System.in);
		
		int choice = s.nextInt();
		
		switch(choice) {
		case 1:
			//Client Code
			System.out.println("Enter the Address and the Port of the Server :");
			address = s.next();
			port = s.nextInt();
			
			Client c = new Client(address,port);
			break;
		case 2:
			//Server Code
			break;
		}
		
		
	}

}
