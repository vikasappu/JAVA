import java.util.Scanner;

public class hello22 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner vi=new Scanner(System.in);
        System.out.println("Enter the number");
        a=vi.nextInt();
        b=vi.nextInt();
        c=vi.nextInt();
        if (a>b)
        {
            System.out.println("a is big");
        }
        else if (b>c)
        {
            System.out.println("b is big");
        }
        else
        {
            System.out.println("c is big2" );
        }
    }
}
