package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        char CharacterName = 'A';
        switch (CharacterName){
            case 'A':
                System.out.println("This is Letter A! ");
                break;

            case 'B':
                System.out.println("This is Letter B! ");
                break;

            case 'C':
                System.out.println("This is letter C! ");
                break;

            case 'D':
                System.out.println("This is leeter D! ");
                break;

            case 'E':
                System.out.println("This is Letter E! ");
                break;

            default:
                System.out.println("Not Found!!! ");
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure!!");
        }

    }

}
