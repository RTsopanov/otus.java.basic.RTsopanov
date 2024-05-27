package oop.hw4;

public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException()
    {
        System.out.println("Недопустимый размер массива!");
    }
}
