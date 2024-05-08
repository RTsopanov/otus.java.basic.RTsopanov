package oop.hw1;


public class MainApp {
        public static void main(String[] args) {

// 1-3
        User user1 = new User("Иванов", "Петр", "Петрович", 1980, "rrr@mail.ru");
        user1.info();


// 4
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1980, "iii@mail.ru"),
                new User("Петров", "Сергей", "Викторовия", 1984, "ppp@mail.ru"),
                new User("Ким", "Андрей", "Андреевич", 1989, "kkk@mail.ru"),
                new User("Сидорова", "Аня", "Ивановна", 1971, "sss@mail.ru"),
                new User("Пташенчук", "Алексей", "Константинович", 1990, "ttt@mail.ru"),
                new User("Галкин", "Мирон", "Генадьевич", 1985, "ggg@mail.ru"),
                new User("Захаров", "Олег", "Сергеевич", 1999, "zzz@mail.ru"),
                new User("Птичкин", "Сан", "Саныч", 1991, "qqq@mail.ru"),
                new User("Ян", "Петр", "Олегович", 1963, "uuu@mail.ru"),
                new User("Миледи", "Анна", "Ивановна", 1983, "mmm@mail.ru")

        };

        for (int i = 0; i < users.length; i++) {
            if ((2024 - users[i].yearOfBirth) > 40) {
                users[i].info();
                System.out.println();
            }
        }


// 5
            Box box1 = new Box(10, 15, 25, "Синий", false, "Мяч");
            box1.info();
            box1.takeItem();
            System.out.println();
//            box1.put();

        }

}



