import java.util.Scanner;

public class D6 {
    
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numdice = 0;
        int dieroll = 0;
        int total   = 0;
        while (ans.equals("y")) {
            System.out.print("how many D6s will be rolled? ");
            numdice = sc.nextInt(); 
            System.out.println("");
            System.out.print("you rolled: ");
            for (int i = 0; i < numdice; i++) {
                dieroll = (int) (Math.random()*6)+1;
                total = total + dieroll;
                System.out.print(dieroll + " ");
            }
            System.out.println("");
            System.out.println("total: " + total);
            System.out.println("");
            System.out.print("again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
        }
    }
}