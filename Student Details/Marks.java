package StudentDetails;

public class Marks extends External{
    public void display()
    {
        System.out.println("Enter Name : ");
        name=ip.nextLine();
        System.out.println("Enter USN : ");
        usn=ip.nextLine();
        i_read();
        e_read();
        System.out.println("Student marks");
        System.out.println("name="+name);
        System.out.println("usn="+usn);
        System.out.println("subject      internal       external     marks" );
        int t=0;
        for (int i=0;i<6;i++)
        {
            System.out.print("subject"+(i+1)+"         ");
            System.out.print(i_marks[i]+"            ");
            System.out.print(e_marks[i]+"            ");
            System.out.println(i_marks[i]+e_marks[i]);
            t+=i_marks[i]+e_marks[i];
        }
        System.out.println("Total marks : "+t);
        System.out.println("Grade : "+((t>210)?"Pass":"Fail"));

    }

    public static void main(String[] args) {
        new Marks().display();
    }
}
