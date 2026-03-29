public class PalindromeSimple {
    public static void main(String[] args) {

        String str = "babad";   
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);
                String rev = "";
                for (int k = sub.length() - 1; k >= 0; k--) {
                    rev = rev + sub.charAt(k);
                }
                if (sub.equals(rev)) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        System.out.println("Longest Palindrome = " + longest);
    }
}