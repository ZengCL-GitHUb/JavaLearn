package com.demo.test.date0818;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriteTest {

    public FileWriteTest(){};
    /**
     * FileWriter 写入
     * @param filepath
     * @param content
     * @throws IOException
     */
    public void fileWrite(String filepath,String content) throws IOException {
        FileWriter fileWriter = new FileWriter(filepath);
        fileWriter.append(content);
        fileWriter.close();
    }

    /**
     * BufferedWriter 写入
     * @param filepath
     * @param content
     * @throws IOException
     */
    public void bufferedWrite(String filepath,String content) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filepath));
        bufferedWriter.write(content);
        bufferedWriter.close();
    }

    /**
     * PrintWriter 写入
     * @param filepath
     * @param content
     * @throws IOException
     */
    public void printWrite(String filepath,String content) throws IOException {
        PrintWriter printWriter=new PrintWriter(new FileWriter(filepath));
        printWriter.print(content);
        printWriter.close();
    }

    /**
     * FileOutputStream 写入
     * @param filepath
     * @param content
     * @throws IOException
     */
    public void fileOutputStreamWrite(String filepath,String content) throws IOException {
        FileOutputStream fileout=new FileOutputStream(filepath);
        fileout.write(content.getBytes());
        fileout.close();
    }

    /**
     * BufferedOutputStream 写入
     * @param filepath
     * @param content
     * @throws IOException
     */
    public void bufferedOutputStreamWrite(String filepath,String content) throws IOException {
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream(filepath));
        outputStream.write(content.getBytes());
        outputStream.close();
    }

    /**
     * Files 写入
     * @param filepath
     * @param content
     * @throws IOException
     */
    public  void filesWrite(String filepath,String content) throws IOException {
        Files.write(Paths.get(filepath),content.getBytes());
    }
}
