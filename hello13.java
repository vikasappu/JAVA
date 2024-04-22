import java.util.Scanner;

public class hello13 {
    public static void main(String[] args) {
        int a,n,d;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        a=s.nextInt();
        n=s.nextInt();
        d=s.nextInt();
        System.out.println("the result is " +((a/2)*(2*(n-1)*d)));

    }
}
