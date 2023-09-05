package com.workintech.mobile;

public class Main {
    public static void main(String[] args){
        MobilePhone phone = new MobilePhone("1234567");
        Contact ayse= new Contact("ayse", "1246789");
        phone.addNewContact(new Contact("Hilal", "1234567"));
        phone.addNewContact(new Contact("Ali", "1234578"));
        phone.printContact();
        System.out.println("find: " + phone.findContact(ayse));
        System.out.println("find2: " + phone.findContact(ayse.getName()));

    }
}
