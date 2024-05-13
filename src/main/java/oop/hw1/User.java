package oop.hw1;

public class User {
    // ПОЛЯ ↓
    private String lastName;
    private String firstName;
    private String surname;
    public int yearOfBirth;
    private String mail;


    // КОНСТРУКТОР ↓
    public User(String lastName, String firstName, String surname, int yearOfBirth, String mail){
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.mail = mail;
    }

    // ДЕЙСТВИЕ ↓
    public void info (){
        System.out.println("ФИО: " + lastName +" "+ firstName +" "+ surname);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + mail);
    }

    // ГЕТТЕР   и    СЕТТЕР

    public String getLastName(){
        return lastName;
    }
    public String getFirtName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public String getMail(){
        return mail;
    }

    // СЕТТЕР

    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setMail(String mail){
        this.mail = mail;
    }

}
