package com.yglearnsec.javasec.RMI;

import java.rmi.Naming;



public class RMIClientTest1 {
    public static void main(String[] args){
        try{
            RMIServer.RMIInterface hello = (RMIServer.RMIInterface) Naming.lookup("rmi://149.129.99.190:9331/test");
            String result = hello.test();

            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
