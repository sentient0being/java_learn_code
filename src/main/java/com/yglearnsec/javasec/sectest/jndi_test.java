package com.yglearnsec.javasec;


public class JNDI_Test {

    public static void main(String[] args) {
/*        System.setProperty("java.rmi.server.useCodebaseOnly", "false");
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");*/


        System.out.print(java.rmi.server.useCodebaseOnly);
        System.out.print(com.sun.jndi.rmi.object.trustURLCodebase);
/*        // 1. 创建一个工厂类
        JNDI_Factory jndiFactory = new JNDI_Factory();
        // 2. 创建一个工厂方法
        JNDI_Factory.JNDI_Method jndiMethod = jndiFactory.getJNDI_Method();
        // 3. 调用工厂方法
        jndiMethod.getJNDI_Object();*/
    }
}