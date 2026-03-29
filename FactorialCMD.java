public class FactorialCMD {
    public static void main(String[] args) {

        // Check if argument is given
        if (args.length < 1) {
            System.out.println("Please provide a number");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}
