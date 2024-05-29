package oop.hw6;

import java.util.*;

import static oop.hw6.PhoneBook.*;


public class Main {
    public static void main(String[] args) {

        List<PhoneBook> book = new ArrayList<>(Arrays.asList(
                new PhoneBook("Иван", "+7-916-534-11-22"),
                new PhoneBook("Олег", "+7-963-444-00-11"),
                new PhoneBook("Петр", "+7-927-333-15-15"),
                new PhoneBook("Сергей", "+7-917-222-17-17"),
                new PhoneBook("Сергей", "+7-999-698-34-58")
        ));



        add("Антон",   "+7-999-999-99-99", book);
        add("Антон",   "+7-999-888-88-88", book);
        System.out.println();

        find("Антон", book);
        System.out.println();

        System.out.println(containsPhoneNumber("+7-999-999-99-99", book));


    }



        public static void add(String name, String phone, List<PhoneBook> list) {
        Set<String> hashSet = new HashSet<>();
            for (PhoneBook emp : list) {
                hashSet.add(emp.getPhoneNumber() + " " + emp.getName());
                hashSet.add(name + " " + phone);
            }
            if(!(hashSet.contains(name) && hashSet.contains(phone))){
                list.add(new PhoneBook(name, phone));
            }
            System.out.println(list);
        }




    public static void find(String name,  List<PhoneBook> list) {
        Map<String, String> user = new HashMap<>();
        for (PhoneBook emp : list) {
            user.put(emp.getPhoneNumber(), emp.getName());
        }
        for (Map.Entry<String, String> entry : user.entrySet()) {
            if (name == entry.getValue()) {
                System.out.println(entry);
            }
        }
    }




    public static boolean containsPhoneNumber (String phone, List<PhoneBook> list){
        Map<String, String> hashSet = new HashMap<>();
        for (PhoneBook emp : list) {
            hashSet.put(emp.getPhoneNumber(), emp.getName());
        }
        if(hashSet.containsKey(phone)){
            return true;
        }
        return false;
    }


}









