public class AvgGradeCMD {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide marks");
            return;
        }

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        double avg = (double) sum / args.length;

        String grade;

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 75) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
}