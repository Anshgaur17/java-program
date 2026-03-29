import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P, R, T, A, CI;

        System.out.print("Enter Principal Amount: ");
        P = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        R = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        T = sc.nextDouble();

        A = P * Math.pow((1 + R / 100), T);
        CI = A - P;

        System.out.println("Compound Interest = " + CI);

        sc.close();
    }
}