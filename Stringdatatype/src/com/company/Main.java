package com.company;

public class Main {

    public static void main(String[] args) {
        String mystring = "This is a string ";
        System.out.println("My String is equal to : " + mystring);
        mystring = mystring + ", and this more...  ";
        System.out.println("My String is equal to: " + mystring);
        mystring = mystring + "\u00A9 ";
        System.out.println("My string is equal to : " + mystring);
        String numberstring = "250.55";
        numberstring = numberstring + "49.55 ";
        System.out.println(numberstring);
        String laststring = "50";
        int myint = 10;
        laststring = laststring + myint;
        System.out.println(laststring);


    }
}
