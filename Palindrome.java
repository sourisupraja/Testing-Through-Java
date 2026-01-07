/*public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int revNum = 0;
        int temp = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if(temp== revNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");

        }
    }
}*/

public class Palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int revNum = 0;
        int temp = n;
        while (n > 0) {
            int ld = n % 10;              // Get the last digit
            revNum = (revNum * 10) + ld;  // Append digit to reversed number
            n = n / 10;                   // Remove last digit from original
        }
        if(temp== revNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");

        }
    }
}