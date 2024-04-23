package StudentDetails;

public class External extends Internal {
    int[] e_marks=new int[10];
    public void e_read()
    {
        System.out.println("Enter External marks : ");
        for(int i=0;i<6;i++)
        {
            System.out.println("subject"+(i+1));
            e_marks[i]=ip.nextInt();
        }
    }

}
