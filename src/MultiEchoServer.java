import java.io.*;
import java.net.*;
public class MultiEchoServer
{
    // socket opbject and the port number of the server
    private static ServerSocket serverSock;
    private static final int PORT = 1234;
    public static void main(String[] args) throws IOException
    {
        try{
            serverSock=new ServerSocket(PORT);
        }
        catch (IOException e)
        {
            System.out.println("Can't listen on " + PORT);
            System.exit(1);
        }
        do
        {
            Socket client = null;
            System.out.println("Listening for connection...");
            try{
                client = serverSock.accept();
                System.out.println("New client accepted");
                ClientHandler handler = new ClientHandler(client);
                handler.start();
            }
            catch (IOException e)
            {
                System.out.println("Accept failed");
                System.exit(1);
            }
            System.out.println("Connection successful");
            System.out.println("Listening for input ...");
        }while(true);
    }
}

class ClientHandler extends Thread
{
    //client mirror object
    private Socket client;
    //takes input from client stream
    private BufferedReader in;
    //output to the client side
    private PrintWriter out;

    public ClientHandler(Socket socket)
    {
        client = socket;
        try
        {
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(),true);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //thread to revieve message and echo back to the client end
    public void run()
    {
        try
        {
            String received;
            do
            {
                received = in.readLine();
                out.println("ECHO: " + received);
                System.out.println(received);

            }while (!received.equals("BYE"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(client!=null)
                {
                    System.out.println("Closing down connection...");
                    client.close();
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}