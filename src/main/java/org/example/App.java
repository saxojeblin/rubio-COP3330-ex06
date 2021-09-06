/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class App 
{
    public static void main( String[] args ) {

        Date currentDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy");

        int age, retire, years, date, left;
        String st_age, st_retire;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current age? ");
        st_age = sc.nextLine();

        System.out.print("At what age would you like to retire? ");
        st_retire = sc.nextLine();

        age = Integer.parseInt(st_age);
        retire = Integer.parseInt(st_retire);
        years = retire - age;
        date = Integer.parseInt(timeFormat.format(currentDate));
        left = date + years;

        System.out.println("You have " + years + " years left until you can retire.");
        System.out.println("It's " + date + ", so you can retire in " + left + ".");
    }
}
