import java.util.Scanner;

public class hello31 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the 4 number:");
        a=vi.nextInt();
        b=vi.nextInt();
        c=vi.nextInt();
        d=vi.nextInt();
        if(a>b)
        {
            if(a>d)
            {
                 System.out.println("a is big");
            }
            else if(c>d)
            {
                System.out.println("c is big");
            }
            else
            {
                System.out.println("d is big");
            }
        }
        else
        {
            if (b>c)
            {
                System.out.println("b is big");
            }
            else if(c>d)
            {
                System.out.println("c is big");
            }
            else
            {
                System.out.println("d is big");
            }
        }

    }
}
