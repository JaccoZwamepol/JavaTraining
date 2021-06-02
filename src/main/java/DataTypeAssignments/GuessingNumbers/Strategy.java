package DataTypeAssignments.GuessingNumbers;
import java.util.Random;

public class Strategy {
    private Random random = new Random();
    private int high = 100;
    private int low = 0;
    private int guess;
    private int lastGuess = 100;
    public int strategy(boolean isGreater) {
        if (isGreater){
            low = lastGuess;
        }
        else {
            high = lastGuess;
        }
        guess = (int) Math.ceil((high-low)/2) + low;
        lastGuess = guess;
        return guess;
    }
}
