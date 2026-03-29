public class Command {
    public static void main(String[] args) {

        // Command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Calculate sum
        int sum = a + b;

        // Output
        System.out.println("Sum = " + sum);
    }
}
