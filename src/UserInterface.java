package src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.prefs.Preferences;

public class UserInterface {
    boolean stop = false;
    Scanner input = new Scanner(System.in);
    private String food[];
    private String events[];
    private preferences pref;

    public UserInterface(){

        System.out.println("Welcome to What is..What?");
        while(!stop) {
            System.out.println("Please enter your username.");
            System.out.println("Username: ");
            String name = input.next();
            CheckUsername checkUsername = new CheckUsername(name);

            if (checkUsername.checker()) {
                while (!stop) {
                    System.out.println("Would you like to set your preferences(1) or input another preferences (2)?");
                    int answer = 0;
                    try {
                        answer = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Wrong input please enter 1 or 2.");
                    }
                    if (answer == 1) {
                        BufferedReader foodInput = new BufferedReader( new InputStreamReader(System.in));
                        System.out.println("Setting food preferences...");
                        System.out.println("Please enter each choice's number separated by commas.");
                        System.out.println("Food Choices:");
                        System.out.println("1) Italian");
                        System.out.println("2) Mediterranean");
                        System.out.println("3) Japanese");
                        System.out.println("4) Indian");
                        System.out.println("5) American");
                        System.out.println("6) Mexican");
                        System.out.println("7) Cafe");
                        System.out.println("8) Other");
                        while(!stop){
                            try{
                                food = foodInput.readLine().split(",");
                                pref = new preferences();
                                pref.addFood(pref.convertInput(food));
                            }catch (IOException e){
                                System.out.println("Wrong input please enter only numbers separated by commas.");
                                System.out.println("Ex. 1,2,3,4");
                            }
                            System.out.println("Setting events preferences...");
                            System.out.println("Please enter each choice's number separated by commas.");
                            System.out.println("Food Choices:");
                            System.out.println("1) Ice Skating");
                            System.out.println("2) Hiking");
                            System.out.println("3) Shopping");
                            System.out.println("4) Movie");
                            System.out.println("5) At Home Hangout");
                            System.out.println("6) Bowling");
                            System.out.println("7) Arcane");
                            System.out.println("8) Amusement Park");
                            System.out.println("9) Park");
                            System.out.println("10) other");
                            while(!stop){
                                try{
                                    BufferedReader choicesInput = new BufferedReader( new InputStreamReader(System.in));
                                    events = choicesInput.readLine().split(",");
                                    pref.addEvents(pref.convertInput(events));
                                    pref.printPref();
                                    choicesInput.close();
                                    stop = true;
                                }catch (IOException e){
                                    System.out.println("Wrong input please enter only numbers separated by commas.");
                                    System.out.println("Ex. 1,2,3,4");
                                }
                            }
                        }
                    } else if (answer == 2) {
                        //call input function
                        stop = true;
                    }
                }
            }
            else{
                System.out.println("Incorrect Username...");
            }
        }
        input.close();
    }
}
