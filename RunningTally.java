import java.util.Scanner;

class RunningTally {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int total = 0;
        System.out.println("add numbers. [type negative number to quit]");
        System.out.println("");
        while (input >= 0) {
            System.out.print("add: ");
            input = sc.nextInt();
            if (input >= 0) {
                total = total + input;    
            }
        }
        System.out.println("");
        System.out.println("total is " + total);
    }
}