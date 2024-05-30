package oop.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList(Arrays.asList(
                new Employee("Ivan", 26),
                new Employee("Oleg", 31),
                new Employee("Petr", 27),
                new Employee("Sergey", 35),
                new Employee("Vlad", 21))
        );


        List<Integer> line = new ArrayList<>(Arrays.asList(1, 10, 7, 5, 11, 4, 8, 6));


        System.out.println(num(4, 12));
        System.out.println(sumList(line));
        System.out.println(rewriteList(8, line));
        System.out.println(increaseNumber(2, line));

        System.out.println(returnListName(employees));
        System.out.println(returnListNameTwo(27, employees));
        System.out.println(averageAge(27, employees));
        System.out.println(minAge(employees));

    }


    public static List num(int min, int max) {
             List<Integer> array = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            array.add(i);
        }
        return array;
    }


    public static int sumList(List<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }


    public static boolean rewriteList(int num, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, num);
        }
        return true;
    }


    public static boolean increaseNumber(int num, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + num);
        }
       return true;
    }


    public static List<String> returnListName(List<Employee> arr) {
        List<String> user = new ArrayList<>();
        for (Employee empe : arr) {
            user.add(empe.getName());
        }
        return user;
    }



    public static List<Employee> returnListNameTwo(int minAge, List<Employee> arr) {
        List<Employee> user = new ArrayList<>();
        for (Employee empe : arr) {
            if (empe.getAge() >= minAge) {
                user.add(empe);
            }
        }
        return user;
    }


    public static boolean averageAge(int minAge, List<Employee> arr) {
        int sumAge = 0;
        int avgAge;
        for (Employee empe : arr) {
            sumAge += empe.getAge() ;
        }
        avgAge = sumAge / arr.size();
        if (avgAge > minAge) {
            return true;
        } return false;
    }


    public static Employee minAge(List<Employee> arr) {
        int num = arr.get(0).getAge();
        Employee empResult = arr.get(0);
        for (Employee emp : arr) {
            if (emp.getAge() < num) {
                num = emp.getAge();
                 empResult = emp;
            }
        }
        return empResult;
    }


}


