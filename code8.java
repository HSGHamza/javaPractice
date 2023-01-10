import java.util.Random;
import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {

        Game g = new Game();

        boolean b = false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}

class Game{
    
    int number;
    int userNumber;
    int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNofGuesses(int noGuess){
        this.noOfGuesses = noGuess;
    }

    Game(){
        Random number = new Random();
        this.number = number.nextInt(100);
    }

    public int takeUserInput(){
        System.out.println("Guess the number");
        Scanner inp = new Scanner(System.in);
        userNumber = inp.nextInt();
        return userNumber;
    }
    boolean isCorrectNumber(){
            noOfGuesses++;
            if(userNumber == number){
                System.out.println("Nice job, U guessed it in " + noOfGuesses + "Attempts");
                return true;
            }else if(userNumber > number){
                System.out.println("Too High");
            }
            else if(userNumber < number){
                System.out.println("Too Low");
            }
            return false;
    }
}

