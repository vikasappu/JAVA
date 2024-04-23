import java.util.Scanner;

public class hello35 {
    public static void main(String[] args) {
        int num, totaldigits=0;
        Scanner vi=new Scanner(System.in);
        System.out.println("enetr the number:");
        num=vi.nextInt();
        while(num!=0)
        {
            totaldigits++;
                    num=num/10;
        }
        System.out.println("the total digits are: "+totaldigits);


    }

}
