import java.util.Scanner;

public class hello32 {
    public static void main(String[] args) {
        int y;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the year:");
        y=vi.nextInt();
        if (y%4==0)
        {
            if(y%100==0)
            {
                if(y%400==0)
                {
                    System.out.println("it is a leap  year");
                }
                else
                {
                    System.out.println("not leap year");
                }
            }
            else
            {
                System.out.println("leap year");
            }
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}
