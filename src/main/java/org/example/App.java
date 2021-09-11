package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Declare variables and scanner
        String userName;
        Scanner scan = new Scanner(System.in);

        //User prompt and scan user input
        System.out.println("What is your name?");
        userName = scan.next();

        //outputs
        System.out.println("Hello, " + userName + ", nice to meet you!");

        //closer scanner
        scan.close();
    }
}
