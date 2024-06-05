package oop.hw3;




public class Main {
    public static void main(String[] args) {



        Human human1 = new Human("Вася", "Car");
        Human human2 = new Human("Олег", "Vezdeod");
        Human human3 = new Human("Роберт", "Horse");
        Human human4 = new Human("Сергей", "Bike");
        Human human5 = new Human("Костя");



        Human[] humans = {human1, human2, human3, human4, human5};


        for (int i = 0; i < humans.length; i++) {
            humans[i].inTransport();
            System.out.println();
        }



    }
}
