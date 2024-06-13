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
        Path path = Paths.get("src", "main", "test");
        File directory = path.toFile();

        if (directory.exists() && directory.isDirectory()) {
            File[] fileList = directory.listFiles();

            if (fileList != null) {
                for (File file : fileList) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty or an I/O error occurred.");
            }
        } else {
            System.out.println("The directory does not exist or is not a directory.");
        }

        System.out.println();
        workWithFile();
    }



    public static void workWithFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для работы с ним. \n");


        Path path  =  Paths.get ("src", "main", "test", scanner.nextLine());
        File directory = path.toFile();


        try (BufferedInputStream buff = new BufferedInputStream(new FileInputStream(directory));
             InputStreamReader in = new InputStreamReader(buff, StandardCharsets.UTF_8)) {
            int n = in.read();
            while (n > 0) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
