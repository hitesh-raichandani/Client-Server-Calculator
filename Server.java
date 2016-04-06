import java.rmi.*;
import java.rmi.Naming.*;

public class Server 
{
	public static void main(String args[])
	{
		try
		{
			//The server registers its remote objects with the RMIRegistry
			//It passes two arguments; object URL and object reference respectively
			//The URL can contains the IP address, default port number and name of Remote Object.
			//But as we are running the client and server on same machine, only name of the remote object is sufficient
			//The second argument is the remote object reference.
			Naming.rebind("Calculator",new CalculatorImplementation());
			System.out.println("Server Running");
		}
		catch(Exception e)
		{
		}
	}
}