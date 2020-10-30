import java.util.Scanner;

public class Triangle {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String  ch = "   ";
        int num    = 0;
        System.out.print("which character is the triangle made of?");
        ch  = sc.next();
        System.out.print("what is the triangle height? ");
        num = sc.nextInt();
        System.out.println("   ");
        System.out.println("here's the triangle:");
        System.out.println("   ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}