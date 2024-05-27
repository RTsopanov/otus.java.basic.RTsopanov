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


//        System.out.println(num(4, 12));
//        System.out.println(sumList(line));
//        rewrite(8, line);
//        rewriteTwo(2, line);
//
//
//        System.out.println(employees);
//        System.out.println();
//
//        employ(employees);
//        employ1(27, employees);
//        employ2(28, employees);
        System.out.println(employ3(employees));
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
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                sum += arr.get(i);
            }
        }
        return sum;
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


    public static List<Employee> employ3(List<Employee> arr) {
        List<Employee> employ = new ArrayList<>();
        int num = arr.get(0).getAge();

        for (Employee emp : arr) {
            if (emp.getAge() < num) {
                num = emp.getAge();
                employ.add(emp);
            }
        }
        return employ;
    }


}


