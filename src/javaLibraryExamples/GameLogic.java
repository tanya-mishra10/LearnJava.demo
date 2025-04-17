package javaLibraryExamples;

import java.util.ArrayList;

public class GameLogic {
    private ArrayList<Integer> locationCells;
    private ArrayList<Integer> guessNumber; //store prev guess
    private UserInput inputHelper;
    public GameLogic(){
        locationCells = new ArrayList<>();
        locationCells.add(2);
        locationCells.add(3);
        locationCells.add(4);

        guessNumber = new ArrayList<>();
        inputHelper = new UserInput();
    }

    public void checkGuess(){
        boolean result = false;
        System.out.println("Welcome to the Number Guess Game!");
        System.out.println("Guess a correct number from the list. You have 3 chances.");
        for(int i=1; i<=3; i++) {
            int guess = inputHelper.getGuess(i);
            if (guessNumber.contains(guess)) {
                System.out.println("Wrong guess! You already guessed that number.");
                continue;
            }
            guessNumber.add(guess);
            if (locationCells.contains(guess)) {
                System.out.println("Congratulations! You guessed a correct number.");
                result = true;
                break;
            } else {
                System.out.println("Wrong guess");
            }
        }
        if(!result){
            System.out.println("Game over! You couldn't guess the number.");
        }
        }
    }

