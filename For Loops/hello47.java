import java.util.Scanner;

public class hello47 {
    public static void main(String[] args) {
        int a,b,c,i,h=1;
        Scanner vi =new Scanner(System.in);
        System.out.println("Enter the 2 number:");
        a=vi.nextInt();
        b=vi.nextInt();
        c=vi.nextInt();


        for(i=1;i<=a && i<=b && i<=c; i++)
        {
          if(a%i==0 && b%i==0 && c%i==0)
          {
              h=i;
          }
        }
        System.out.println(+h);
    }
}
