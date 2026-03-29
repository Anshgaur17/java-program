public class LongestUniqueSubstring {
    public static void main(String[] args) {

        String str = "abcabcbb";  // input
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if (temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Substring = " + longest);
        System.out.println("Length = " + longest.length());
    }
}