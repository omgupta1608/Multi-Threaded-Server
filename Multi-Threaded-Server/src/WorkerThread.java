import java.util.*;
import java.net.*; 
import java.io.*; 
  
public class WorkerThread implements Runnable {

	protected Socket clientSocket = null;
    protected String serverText   = null;

    public WorkerThread(Socket clientSocket, String serverText) {
        this.clientSocket = clientSocket;
        this.serverText   = serverText;
    }

    public void run() {
        try {
            InputStream input  = clientSocket.getInputStream();
            OutputStream output = clientSocket.getOutputStream();
            long time = System.currentTimeMillis();
            output.write(("HTTP/1.1 200 OK\n\nWorkerRunnable: " +
            			this.serverText + " - " +
            			time +
            			"").getBytes());
            output.close();
            input.close();
            System.out.println("Request processed: " + time);
        } catch (IOException e) {
            //report exception somewhere.
            e.printStackTrace();
        }
    }

}
