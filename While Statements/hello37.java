import java.util.Scanner;

public class hello37 {
    public static void main(String[] args) {
        int num,td=0;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the  number");
        num=vi.nextInt();
        int t=num;
        while(num!=0)
        {
            td++;
            num=num/10;
        }
        System.out.println("the total digits are: "+td);
        num=t;
        int s=0;
        while(num!=0)
        {
            s=s+(int)Math.pow((num%10),td);
            num=num/10;
        }
        if(s==t)
        {
            System.out.println("it is armstrong no");
        }
        else
        {
            System.out.println("it is not armstrong no");
        }
    }
}
