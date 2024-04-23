import java.util.Scanner;

public class hello40 {
    public static void main(String[] args) {
        int  num,digits ,sum=0,t;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number");
        num=vi.nextInt();
        t=num;
        while(num>0)
        {
            digits =num%10;
            sum=sum*10+digits;
            num/=10;
        }
        if(sum==t)
        {
            System.out.println("it is a palindrome");
        }
        else

        {
            System.out.println("it is not a palindrome");
        }

    }
}
