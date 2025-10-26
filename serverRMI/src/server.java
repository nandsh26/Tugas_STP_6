
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS VIVOBOOK
 */
public class server extends UnicastRemoteObject implements interfaceRMI{
    public server() throws RemoteException
    {
        super();
    }
    public int tambah(int k1, int k2)throws RemoteException
    {
        return k1+k2;
    }
    public static void main (String[] args){
        try{
            Registry reg = LocateRegistry.createRegistry(1022);
            reg.rebind("server", new server());
            System.out.println("Server Berjalan");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
