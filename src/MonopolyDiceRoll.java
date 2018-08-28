/**
 * Author Alex Grullon
 * Date 8/28/18
 * Description Monopoly dice roll program
 */
public class MonopolyDiceRoll {
    public static void main(String[] args) {
        //Method calling
        monopolyRoll();
    }
    /**
     * Returns a random integer simulating a dice roll.
     *
     * @return random number in the range of 1 to sides.
     */
    private static int randomNumber() {
        int sides = 6;
        double randomNumber = Math.random() * sides;
        randomNumber = randomNumber + 1;
        return (int) randomNumber;
    }

    /**
     * Prints the dices number
     */
    private static void monopolyRoll() {
        int roll1 = randomNumber(), roll2 = randomNumber(), roll3 = randomNumber(), roll4 = randomNumber();
        int sum = roll1 + roll2;
        if (roll1 != roll2) {
            System.out.println("Dice 1: " + roll1 + "\n" + "Dice 2: " + roll2 + "\n"
                    + "Move piece " + sum + " steps");
        } else {
            System.out.println("Dice 1: " + roll1 + "\n" + "Dice 2: " + roll2 + "\n"
                    + "Move piece " + sum + " steps" + "\n" + "\t" + "Roll dice again");
            int totalSteps = roll1 + roll2 + roll3 + roll4;
            sum = roll3 + roll4;
            System.out.println("Dice 3: " + roll3 + "\n"
                    + "Dice 4: " + roll4 + "\n" + "Move piece " + sum + " steps"
                    + "\n" + "\t" + "You've moved your piece " + totalSteps + " steps");
        }
    }
}
