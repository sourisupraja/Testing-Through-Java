public class SwapNumbers {
    public static void main(String[] args){
        int a = 20;
        int b = 14;
        int temp;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
