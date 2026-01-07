package JAVA;
public class ReverseInteger {
    public static void main(String[] args) {
        int n = 2234;
        int revNum = 0;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        System.out.println("Reversed number: " + revNum);
    }
}