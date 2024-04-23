import java.util.Scanner;

public class hello45 {
    public static void main(String[] args) {
        int a=0,b=1,c,n,i;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number:");
        n=vi.nextInt();
        System.out.println(+a+ "\n"+b);
        for(i=0;i<n;i++)
        {
            c=a+b;
            System.out.println(+c);
            a=b;
            b=c;
        }
    }
}
