//Jon Jiang
//Twyford 27
//CSA
//10/05/2025
import java.util.Scanner;

public class Farkle {
    private int totalScore;

    public Farkle() {
        totalScore = 0;
    }

    public void playGame() {
		// allows for mult types to be inputted in the system/computer
        Scanner scanner = new Scanner(System.in);
        
        //asks if u wanna play w fixed dice num or custom
        System.out.print("Do you want to play with 5 rolls? (y/n): ");
        String choice = scanner.nextLine();
        
        int numDice;
        //depends on which letter u chose
        //and Jason I did NOT use AI I used w3schools
        if (choice.equals("y")) {
            numDice = 5;
        } else {
            System.out.println("How many dice do you want to roll? ");
            numDice = scanner.nextInt();
        }
        //thought it would look betetr ngl
        System.out.println("Rolling " + numDice + " dice...");
        //yes I added these comments, JASON, and the ..., for DRAMATIC eefect

        
        int sum = 0;
        System.out.print("Dice values: ");
        
        // Roll num dice u inputted
        //random value of each die
        for (int i = 1; i <= numDice; i++) {
			Dice die = new Dice();
            int diceValue = die.roll();
            sum += diceValue;
            System.out.print(diceValue + " ");
        }
        
        System.out.println();
        System.out.println("Total score: " + sum);
        scanner.close();
    }
}

