package oop.hw12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file;
        char simvol;


        System.out.println("Введите имя файла");
        file = scanner.nextLine().trim();
        while (file.isEmpty()) {
            System.out.println("Имя файла не может быть пустым. Введите имя файла");
            file = scanner.nextLine().trim();
        }


        System.out.println("Введите букву");
        simvol = scanner.nextLine().trim().charAt(0);
        scanner.close();

        System.out.println(search(file, simvol));

    }


    public static int search(String file, char simvol) {
        int count = 0;
        String str;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((str = br.readLine()) != null) {
                char[] arr = str.toCharArray();
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] == simvol && arr[i + 1] == simvol) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }


}
