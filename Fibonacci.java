public class Fibonacci {
    public static void main(String[] args){

        int a = 0, b = 1, c;
        System.out.println("Fibonacci series from 1 to 100: ");

        while (b <= 100) {
            System.out.print(b+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
