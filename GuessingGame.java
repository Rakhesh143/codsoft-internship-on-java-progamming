import java.util.Random;
import java.util.Scanner;

class Number {
    
    public int num = 0;
    public int userInput = 0;
    private int noOfGuesses = 0;

    public Number(int r) {           //Constructor to generate Random number
       this.num = r;
    }

    public void setuserInput(int n) {  //method to set user input
        userInput = n;
    }

    public int getuserInput() {
        return userInput;
    }

    boolean isCorrect() {   //boolean method to check if number is same or not
        noOfGuesses++;
        setnoOfGuesses(noOfGuesses);
        if(num == userInput) {                //if randomNumber = userInput?
            System.out.format("Congratulations! Yes it was %d.\nYou won the game in %d attempt(s)..." , num , getnoOfGuesses());
            return true;
        } 
        else if(num < userInput) {
            System.out.println("Try putting a lower number");
        }
        else if(num > userInput) {
            System.out.println("Try putting a higher number");
        }
        return false;
    }

    
    public void setnoOfGuesses(int g) {   //setter for noOfGuesses
        noOfGuesses = g;
    }

    public int getnoOfGuesses() {   //getter for noOfGuesses
        return noOfGuesses;
    }


}

public class GuessingGame {
    public static void main(String[] args) {
        /*Creating a class Game, whihc allows a user to play "Guess the Number game"
         * 
         * Game should have following methods:
         * 1 = Constructor to generate Random number
         * 2 = userInput() to take user input
         * 3 = isCorrect() to check if the number is same as computer generated
         * 4 = getters and setters for noOfGuesses
         * 
         * Game should have following properties:
         * 1 = noOfGuesses(int) , etc
         */

        Random rand = new Random();    //Creating object of Random Class to generate random number
        Scanner sc = new Scanner(System.in);
        Number nm = new Number(rand.nextInt(100));  //creating object of Number class with constructor initialization


        System.out.println("Enter a number between 1 to 100 to check if you can guess the correct number...");
        nm.setuserInput(sc.nextInt());

        
        while(!nm.isCorrect()) {    

        nm.setuserInput(sc.nextInt());
        
        }
        sc.close();    
    }
}