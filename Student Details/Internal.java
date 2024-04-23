package StudentDetails;

public class Internal extends Student {
    int[] i_marks=new int[10];
    public void i_read()
    {
        System.out.println("Enter Intenal marks : ");
        for(int i=0;i<6;i++)
        {
            System.out.println("subject"+(i+1));
            i_marks[i]=ip.nextInt();
        }
    }

}
