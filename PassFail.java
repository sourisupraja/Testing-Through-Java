package JAVA;
import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        String[] status = {"Pass","Fail","Pass","Pass","Fail","Pass"} ;
        int pc = 0;
        int fc = 0;
        for (int i = 0; i < status.length; i++) {
            String value = status[i].trim().toLowerCase();
            if (value.equals("pass")) {
                pc++;
            }
            else if (value.equals("fail")) {
                fc++;
            }
        }
        System.out.println("Number of Pass: " + pc);
        System.out.println("Number of Fail: " + fc);
    }
}