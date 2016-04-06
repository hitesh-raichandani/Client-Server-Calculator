//This is the implementation of interface methods and runs on the remote server

//Packages required to implement RMI functions and RMI server
import java.rmi.*;
import java.rmi.server.*;

//UnicastRemoteObject is base class for all remote objects and provides point-to-point TCP connection
public class CalculatorImplementation extends UnicastRemoteObject implements Calc
{
	public CalculatorImplementation() throws RemoteException
	{
	}

	public int calculate(int opcode, int op1,int op2) throws RemoteException
	{
		if(opcode == 43)//ascii value for + is 43
			return(op1 + op2);
		else if(opcode == 45)//ascii value for - is 45
			return(op1 - op2);
		else if(opcode == 42)//ascii value for * is 42
			return(op1 * op2);
		else if(opcode == 47)//ascii value for / is 47
			return(op1 / op2);
		else
			return 0;
	}
	public int exit() throws RemoteException
	{
		System.out.println("Client Disconnected");
		return 0;
	}
} 