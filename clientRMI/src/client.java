
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS VIVOBOOK
 */
public class client {
    public static void main(String[] args) {
        client a = new client();
        a.connectserver();
    }
    
    private void connectserver(){
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",1022);
            interfaceRMI b = (interfaceRMI) reg.lookup("server");
            System.out.println("Hasil Penjumlahan adalah "+ b.tambah(45,90));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
