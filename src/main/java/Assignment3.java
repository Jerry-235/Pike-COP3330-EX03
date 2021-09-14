/*
 *  UCF COP3330 Fall 2021 Assignment 03 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter a quote: ");
        String quote = input1.nextLine();

        System.out.println("Who is it by? :");
        String person = input1.nextLine();

        System.out.println(person + " says, " + '"' + quote + '"');
    }

    }
