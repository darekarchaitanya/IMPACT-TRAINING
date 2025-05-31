import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
        int a = 321;
        int b= ((a%10)*100)+(((a/10)%10)*10)+(a/100);
        System.out.println(b);
    }
}
