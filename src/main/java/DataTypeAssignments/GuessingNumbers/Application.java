package DataTypeAssignments.GuessingNumbers;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number to guess: " + number);
        CheckNumber checkNumber = new CheckNumber();
        Guesser guess = new Guesser();
        while (!checkNumber.getStop()){
            checkNumber.checkNumber(number, guess.guesser(checkNumber.getIsGreater()));
        }
        System.out.println("Correct!! Number of quesses needed: " + checkNumber.getTries());
        CheckNumber checkNumber2 = new CheckNumber();
        Strategy strategy = new Strategy();
        while (!checkNumber2.getStop()){
            checkNumber2.checkNumber(number, strategy.strategy(checkNumber2.getIsGreater()));
        }
        System.out.println("Correct!! Number of quesses needed: " + checkNumber2.getTries());

        if (checkNumber.getTries() == checkNumber2.getTries()) {
            System.out.println("Both strategies are equal.");
        }
        else if (checkNumber.getTries() > checkNumber2.getTries()){
            System.out.println("Best strategy is to half the guess each time.");
        }
        else {
            System.out.println("Best strategy is no strategy.");
        }
    }
}
