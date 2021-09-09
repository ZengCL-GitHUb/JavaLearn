package com.demo.test.date0818;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // 反射
        DemoTest01 demo=new DemoTest01();
        DemoTestVo demoTestVo=new DemoTestVo().valueOf("测试1","男",18);
        demo.reflectTest(demoTestVo);
        // 泛型
        DemoT<String> demoT=new DemoT<>("测试2");
        DemoT<Integer> demoT2=new DemoT<>(1);
        demo.anyType(demoT);
        demo.anyType(demoT2);
        // 文件写入
        try {
            FileWriteTest fileWrite=new FileWriteTest();
            StringBuffer buffer =new StringBuffer();
            for(int i=0;i<1000;i++){
                buffer.append("大猪蹄子，你好呀");
                buffer.append("\n");
            }
            fileWrite.fileWrite("D:/app/fileWrite.txt",buffer.toString());
            fileWrite.bufferedWrite("D:/app/bufferedWrite.txt",buffer.toString());
            fileWrite.bufferedOutputStreamWrite("D:/app/bufferedWrite.java",buffer.toString());
        }catch (Exception e){
            System.out.println("写入文件异常："+e.getMessage());
        }
    }


}
