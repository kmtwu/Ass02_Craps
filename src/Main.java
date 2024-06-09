//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int dice1 = generator.nextInt(6) + 1;
        int dice2 = generator.nextInt(6) + 1;
        int sum;
        sum = dice1 + dice2;
        int point;
        boolean contPoint = true;
        boolean YorN = false;
        String response;
        System.out.println("Welcome to my craps game!");
        do {
            System.out.println("Your first roll is:");
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Sum: " + sum);
            System.out.println();
            if (sum == 2) {
                System.out.println("Your sum was a 2, so you lose! :)");
                System.out.println();
            }
            else if (sum == 3) {
                System.out.println("Your sum was a 3, so you lose! :)");
                System.out.println();
            }
            else if (sum == 12) {
                System.out.println("Your sum was a 12, so you lose! :)");
                System.out.println();
            }
            else if (sum == 7) {
                System.out.println("Your sum was a 7, so you win! :)");
                System.out.println();
            }
            else if (sum == 11) {
                System.out.println("Your sum was a 11, so you win! :)");
                System.out.println();
            }
            else {
                point = sum;
                System.out.println("The point is now " + point + ".");
                System.out.println();
                while (contPoint) {
                    dice1 = generator.nextInt(6) + 1;
                    dice2 = generator.nextInt(6) + 1;
                    sum = dice1 + dice2;
                    System.out.println("Your next roll is: ");
                    System.out.println("Dice 1: " + dice1);
                    System.out.println("Dice 2: " + dice2);
                    System.out.println("Sum: " + sum);
                    System.out.println();
                    if (sum == point) {
                        System.out.println("You matched the point with a sum of " + point + ", so you win! :)");
                        System.out.println();
                        contPoint = false;
                    }
                    else if (sum == 7) {
                        System.out.println("Your sum was 7, so you lose! :(");
                        contPoint = false;
                        System.out.println();
                    }
                }
            }
            System.out.println("Would you like to play again? Y/N");
            response = in.next();
            if (response.equals("Y")) {
                YorN = true;
                System.out.println("You decided to play again!");
                System.out.println();
                contPoint = true;
                dice1 = generator.nextInt(6) + 1;
                dice2 = generator.nextInt(6) + 1;
                sum = dice1 + dice2;
            }
            else if (response.equals("N")) {
                System.out.println("You ended the game!");
                YorN = false;
            }
        } while (YorN);
    }
}