import java.rmi.*;
import java.rmi.Naming.*;
import java.util.*;

public class Client
{
	public static void main(String args[])
	{
		int operand, op1, op2;
		Scanner sc = new Scanner(System.in);

		try
		{
			//Client passes the registered URL of the server object to get access to it 
			Calc c = (Calc) Naming.lookup("//localhost/Calculator");
			int x = 0;
	        	do
	        	{
	        		System.out.print("Client: ");
	        		operand = (int) sc.next().charAt(0);
	        		if (operand == 69 || operand == 101)
	        		{
	        			System.out.println("Server: I am out");
	        			c.exit();
	        			break;
	        		}
		       		op1 = sc.nextInt();
		       		op2 = sc.nextInt();
		       	
		       		System.out.println("Server: " + c.calculate(operand, op1, op2));	
		       		System.out.println();
	        	}while(x == 0);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
				
				
	}
}