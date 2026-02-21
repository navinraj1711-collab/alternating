import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
        } else {
            int head = 1;
            int step = 1;
            int remaining = n;
            boolean leftToRight = true;

            while (remaining > 1) {
                if (leftToRight || remaining % 2 == 1) {
                    head += step;
                }
                remaining /= 2;
                step *= 2;
                leftToRight = !leftToRight;
            }
            System.out.println(head);
        }
        
        sc.close();
    }
}