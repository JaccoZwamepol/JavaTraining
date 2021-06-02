package DataTypeAssignments.GuessingNumbers;
import java.util.Random;

public class CheckNumber {
    private boolean stop = false;
    private boolean isGreater;
    private int tries = 0;
    public void checkNumber(int number, int guess){
        if (guess == number) {
            System.out.println("Guess: " + guess);
            stop = true;
        }
        else if (guess > number){
            System.out.println("Guess: " + guess);
            System.out.println("No it is less.");
            isGreater = false;
        }
        else {
            System.out.println("Guess: " + guess);
            System.out.println("No it is greater");
            isGreater = true;
        }
        tries += 1;
    }
    public boolean getIsGreater(){
        return isGreater;
    }
    public boolean getStop(){
        return stop;
    }
    public int getTries(){
        return tries;
    }
}
