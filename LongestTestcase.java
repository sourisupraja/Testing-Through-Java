package JAVA;
public class LongestTestcase {
    public static void main(String[] args) {
        String[] longest = {"Login", "VerifyhomePage", "logout"};
        String longestName = "";
        int maxLength = 0;
        for (int i = 0; i < longest.length; i++) {
            String current = longest[i];
            if (current.length() > maxLength) {
                maxLength = current.length();
                longestName = current;
            }
        }

        System.out.println("Longest Testcase Name: " + longestName);
        System.out.println("Length: " + maxLength);
    }
}