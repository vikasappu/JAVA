import java.util.Scanner;

public class hello30 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner vi=new Scanner(System.in);
        System.out.println("Enter the 3 number:");
        a=vi.nextInt();
        b=vi.nextInt();
        c=vi.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is big");
            }
            else
            {
                System.out.println("c is big");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is big");
            }
            else
            {
                System.out.println("c is big");
            }
        }
    }
}
