import java.util.Scanner;

public class hello29 {
    public static void main(String[] args) {
        short a;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number:");
        a=vi.nextShort();

        if(a>=0 && a<=9 )
        {
            System.out.println("it is a number");
        }
        else
        {
            System.out.println("it is not a number");
        }
    }
}
