import java.util.Scanner;

public class hello41 {
    public static void main(String[] args) {
        int a,b,l;

        Scanner vi=new Scanner(System.in);
        System.out.println("enter 2 number");
        a=vi.nextInt();
        b=vi.nextInt();
        if(a>b)
        {
            l=a;
        }
        else
        {
            l=b;
        }
        while (true)
        {
            if(l%a==0 && l%b==0)
            {
                System.out.println("lcm is "+l);
                return;
            }
            l++;
        }

    }

}
