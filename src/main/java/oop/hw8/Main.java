package oop.hw8;

import java.io.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        allFile();
    }


    public static void allFile() {

        File path  = new File ("src\\main", "test");
        File directory = new File(String.valueOf(path));
        File[] fileList = directory.listFiles();


       for (File file : fileList) {
            System.out.println(file.getName());
        }


        System.out.println();
        workWtithFile();

    }



    public static void workWtithFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для работы с ним. \n");


        File path  = new File ("src\\main\\test", scanner.nextLine());
        File directory = new File(String.valueOf(path));


        try (BufferedInputStream buff = new BufferedInputStream(new FileInputStream(directory));
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
        try (BufferedOutputStream buff = new BufferedOutputStream(new FileOutputStream(directory, true))) {
            byte[] bytes = newLine.getBytes(StandardCharsets.UTF_8);
            buff.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (BufferedInputStream buff = new BufferedInputStream(new FileInputStream(directory));
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
