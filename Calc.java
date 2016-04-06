//package required to import RMI functionality
import java.rmi.*;

public interface Calc extends Remote
{
	//RemoteException handles the network errors
	public int calculate(int opcode, int op1,int op2) throws RemoteException;
	public int exit() throws RemoteException;
}