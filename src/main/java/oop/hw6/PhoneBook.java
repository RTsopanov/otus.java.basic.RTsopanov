package oop.hw6;


public class PhoneBook {

    String name;
    String phoneNumber;

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

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






    @Override
    public String toString() {
        return
                name + " " + phoneNumber;
    }
}

