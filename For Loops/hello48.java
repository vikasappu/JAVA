import java.util.Scanner;

public class hello48 {
    public static void main(String[] args) {
        int a=0,b=1,c,n,i,sum=0;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number:");
        n=vi.nextInt();
        System.out.println(+a+ "\n"+b);
        for(i=0;i<n;i++)
        {
            c=a+b;
            if(c%2==0) {
                sum = sum + c;
            }
            System.out.println(+c);
            a=b;
            b=c;

        }

        System.out.println("the sum is " +sum);
    }
}
