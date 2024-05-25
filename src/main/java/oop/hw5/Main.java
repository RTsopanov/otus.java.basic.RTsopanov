package oop.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


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


        num(5, 10);
        sumList(line);
        rewrite(8, line);
        rewriteTwo(2, line);


        System.out.println(employees);
        System.out.println();

        employ(employees);
        employ1(27, employees);
        employ2(28, employees);
        employ3(employees);
    }


    public static void num(int min, int max) {
        List<Integer> array = new ArrayList<>();
        array.add(0, min);
        array.add(array.size() - 1, max);
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void sumList(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                sum += arr.get(i);
            }
        }
        System.out.println("sum = " + sum);
    }


    public static void rewrite(int num, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, num);
        }
        System.out.println(arr);
    }


    public static void rewriteTwo(int num, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + num);
        }
        System.out.println(arr);
    }

    public static void employ(List<Employee> arr) {
        List<String> user = new ArrayList<>();
        for (Employee empe : arr) {
            user.add(empe.getName());
        }
        System.out.println(user);
    }


    public static void employ1(int minAge, List<Employee> arr) {
        List<String> user = new ArrayList<>();
        for (Employee empe : arr) {
            if (empe.getAge() <= minAge) {
                user.add(empe.getName() + " " + empe.getAge());
            }
        }
        System.out.println(user);
    }


    public static void employ2(int minAge, List<Employee> arr) {
        int count = 0;
        int sumAge = 0;
        int avg;
        for (Employee empe : arr) {
            count++;
            sumAge += empe.getAge();
        }
        avg = sumAge / count;
        if (avg > minAge) {
            System.out.println(avg + " > " + minAge + "\nСредний возраст сотрудников больше, минмального среднего возраста.");
        } else if (avg == minAge) {
            System.out.println(avg + " = " + minAge + "\nСредний возраст сотрудников равен, минмальному среднему возрасту.");
        } else
            System.out.println(avg + " < " + minAge + "\nСредний возраст сотрудников меньше, минмального среднего возраста.");
    }


    public static int employ3(List<Employee> arr) {

        int num = 0;
        int index = 0;
//        String name = "";
        for (int i = 0; i < arr.size(); i++) {
            num = arr.get(0).getAge();
//            name = arr.get(0).getName();

            if (num > arr.get(i).getAge()) {
                num = arr.get(i).getAge();
//                name = arr.get(i).getName();
                index = i;
            }
        }
        System.out.println("Индекс самого молого сотрудника " + index);
        return index;
    }


}


