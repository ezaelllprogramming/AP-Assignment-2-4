import java.util.Scanner;

class Bar {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String  ch = "   ";
        int num    = 0;
        System.out.print("which character is the bar made of? ");
        ch  = sc.next();
        System.out.print("what is the bar length? ");
        num = sc.nextInt();
        System.out.println("   ");
        System.out.println("here is the bar:");
        System.out.println("   ");
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }
}