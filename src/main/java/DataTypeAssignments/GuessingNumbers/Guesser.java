package DataTypeAssignments.GuessingNumbers;
import java.util.Random;

public class Guesser {
    private Random random = new Random();
    private int high = 100;
    private int low = 0;
    private int guess;
    private int lastGuess = 100;
    public int guesser(boolean isGreater) {
        if (isGreater){
            low = lastGuess;
        }
        else {
            high = lastGuess;
        }
        guess = random.nextInt(high-low) + low + 1;
        lastGuess = guess;
        return guess;
    }
}
