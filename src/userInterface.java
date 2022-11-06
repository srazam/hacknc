package src;
import java.util.Scanner;

public class userInterface {
    boolean stop = false;
    Scanner input = new Scanner(System.in);

    public userInterface(){

        System.out.println("Welcome to WhatandWhen!");
        while(!stop){
            System.out.println("Would you like to set your preferences(1) or input another preferences (2)?");
            int answer = input.nextInt();
            if(answer == 1){
                //call set preferences
                stop = true;
            }
            else if(answer == 2){
                //call input function
                stop = true;
            }
            else{
                System.out.println("Wrong input please enter 1 or 2.");
            }

        }

        input.close();
    }
}
