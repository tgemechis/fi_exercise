package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String red;

        Scanner scan = new Scanner(System.in);
        System.out.println("Are your eyes red?");
        red = scan.next();

        if (red.equalsIgnoreCase("yes")) {
            System.out.println("You need some sleep.");
        }
        else if (red.equalsIgnoreCase("again")) {
            System.out.println("Do you want to try again?");
        }
         else if (red.equalsIgnoreCase("no") ) {
            System.out.println("You look great!");
        }


    }

    }

