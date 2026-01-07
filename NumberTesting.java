
public class NumberTesting {
    public static void main(String[] args) {
        String[] s1 = {"Test01_abort", "Login", "Homepage", "Testcase_02"};
        System.out.println("Testcases containing numbers:");
        for (String test : s1) {
            boolean hasNumber = false;
            for (int i = 0; i < test.length(); i++) {
                if (Character.isDigit(test.charAt(i))) {
                    hasNumber = true;
                    break;
                }
            }
            if (hasNumber) {
                System.out.println(test);
            }
        }
    }
}