package oop.hw8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        allFile();
    }


    public static void allFile() {
        String prth = "C:\\Users\\User\\Desktop\\JAVA\\OTUS\\otus.java.basic.RTsopanov\\test";
        File fileList = new File(prth);
        File[] file1 = fileList.listFiles();
        for (File file : file1) {
            System.out.println(file.getName());
        }


        System.out.println();
        workWtithFile();

    }



    public static void workWtithFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для работы с ним. \n");


        String nameFile = "C:\\Users\\User\\Desktop\\JAVA\\OTUS\\otus.java.basic.RTsopanov\\test\\" + scanner.nextLine();
        try (BufferedInputStream buff = new BufferedInputStream(new FileInputStream(nameFile));
             InputStreamReader in = new InputStreamReader(buff, StandardCharsets.UTF_8)) {
            int n = in.read();
            while (n > 0) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println();
        }



        System.out.println("\n\nВведите текст для добавления в файл");
        String newLine = "\n" + scanner.nextLine();
        try (BufferedOutputStream buff = new BufferedOutputStream(new FileOutputStream(nameFile, true))) {
            byte[] bytes = newLine.getBytes(StandardCharsets.UTF_8);
            buff.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (BufferedInputStream buff = new BufferedInputStream(new FileInputStream(nameFile));
             InputStreamReader in = new InputStreamReader(buff, StandardCharsets.UTF_8)) {
            int n = in.read();
            while (n > 0) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println();
        }
    }
}
