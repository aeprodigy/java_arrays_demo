package com.company;//uses the scanner class.
import java.util.*;
public class Main {
//This program is about the introduction to Arrays in JAVA.
    public static void main(String[] args) {
	// write your code here
        System.out.println("This program is about the introduction to Arrays in JAVA");


        int [] gamers = new int[10];
        gamers[0] = 5;
        gamers[1] = 25;
        gamers[2] = 45;
        System.out.println("Please input The value for the Index 3 in this array.");
        Scanner cin = new Scanner(System.in);
        int indexThree = cin.nextInt();
        gamers[3]=indexThree;

        System.out.println("The Value at Index[3] is : "+gamers[3]);

        for (int i = 0; i <10;i++)
        {
            System.out.println("Enter the Value"+i);
            int looper = cin.nextInt();
            gamers[i]=looper;
            System.out.println("The value is: "+gamers[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("The values Entered are: ");
        for (int i=0;i<10;i++){

            System.out.println(i+" "+gamers[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
