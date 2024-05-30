package oop.hw6;


import java.util.*;

public class PhoneBook {

    String name;
    String phoneNumber;


    public static Map<String, Set<String>> book = new HashMap<>();


    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        Set<String> phone = new HashSet<>();
        phone.add(phoneNumber);
        book.put(name, phone);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static void add(String name, String phone1) {
        Set<String> map = new HashSet<>();

        for (Map.Entry<String, Set<String>> emp : book.entrySet()) {
            if (emp.getKey() == name) {
                map.add(emp.getValue() + " " + phone1);
                book.put(emp.getKey(), map);
            }
        }
        if (!(book.containsKey(name))) {
            map.add(phone1);
            book.put(name, map);
        }
        System.out.println(book);
    }


    public static void find(String name) {
        for (Map.Entry<String, Set<String>> emp : book.entrySet()) {
            if (emp.getKey() == name) {
                System.out.println("Имя: " + emp.getKey() + " " + "Тел: " + emp.getValue());
            }
        }
    }


    public static boolean containsPhoneNumber(String phone) {
        Set<String> str = new HashSet<>();
        str.add(phone);
        if (book.containsValue(str)) {
            return true;
        }
        return false;
    }

}


