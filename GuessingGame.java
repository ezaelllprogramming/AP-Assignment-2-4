import java.util.Scanner;

class GuessingGame {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries  = 0;
        int guess  = 0;
        int target = (int) (Math.random()*100) + 1;
        System.out.println("guess a random number between 1 and 100.");
        while (guess != target) {
            System.out.print("what do you guess? ");
            guess = sc.nextInt();
            tries++;
            if (guess < target) {
                System.out.println("too low.");
            } else if (guess > target) {
                System.out.println("too high.");
            }
        }
        
        System.out.println("congragulations, you've guessed the number.  it only took you " + tries + " tries.");
    }
}