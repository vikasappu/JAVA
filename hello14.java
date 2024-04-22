import java.util.Scanner;

public class hello14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 3 number");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("the result is"+(-b+(Math.sqrt(b*b-4*a*c))/2*a));
        System.out.println("the result is"+(-b-(Math.sqrt(b*b-4*a*c))/2*a));
    }
}
