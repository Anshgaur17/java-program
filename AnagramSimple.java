import java.util.*;

public class AnagramSimple {
    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate"};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == "") continue;

            System.out.print("[ " + arr[i]);

            for (int j = i + 1; j < arr.length; j++) {

                char[] a = arr[i].toCharArray();
                char[] b = arr[j].toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                if (Arrays.equals(a, b)) {
                    System.out.print(", " + arr[j]);
                    arr[j] = ""; 
                }
            }

            System.out.println(" ]");
        }
    }
}