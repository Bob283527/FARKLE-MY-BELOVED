//Jon Jiang
//Twyford 27
//CSA
//10/05/2025

public class Dice {
    private int sides;
    private int currentValue;

//defines how many sides a dice has
    public Dice() {
        sides = 6;
    }
     // Constructor that allows custom sides
     //lekwy forgot to use it
    public Dice(int numSides) {
        sides = numSides;
    }
    
//sets the current value of the dice
//ie it sets the dice number when you place it down, the default value
    public int roll() {
        currentValue = (int)(Math.random() * sides) + 1;
        return currentValue;
    }

    
    public int getValue() {
        return currentValue;
    }

  
    public int getSides() {
        return sides;
    }

}

