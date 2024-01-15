package com.yglearnsec.javasec.RMI;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
    public static final String RMI_HOST = "127.0.0.1";
    public static final int RMI_PORT = 9331;
    public static final String RMI_NAME = "rmi://"+ RMI_HOST+":"+RMI_PORT+"/test";

    public interface RMIInterface extends Remote {
        String test() throws RemoteException;
    }

    public class RMITestImpl extends UnicastRemoteObject implements RMIInterface {
        private static final long serialVersionUID = 1L;

        protected RMITestImpl() throws RemoteException {
            super();
        }

        @Override
        public String test() throws RemoteException {
            System.out.println("call from");
            return "Hello RMI~";
        }
    }

    private void start() throws Exception {
        LocateRegistry.createRegistry(RMI_PORT);
        Naming.bind(RMI_NAME,new RMITestImpl());
        System.out.println("RMI service start sucess,address:"+RMI_NAME);
    }

    public static void main(String[] args){
        try{
            new RMIServer().start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
