package oop.hw3;


import static oop.hw3.Transport.*;

public class Main {
    public static void main(String[] args) {



        Human human1 = new Human("Вася", car);
        Human human2 = new Human("Олег", vezdehod);
        Human human3 = new Human("Роберт", horse);
        Human human4 = new Human("Сергей", bike);
        Human human5 = new Human("Костя");



        Human[] humans = {human1, human2, human3, human4, human5};


        for (int i = 0; i < humans.length; i++) {
            humans[i].inTransport();
            System.out.println();
        }



    }
}
