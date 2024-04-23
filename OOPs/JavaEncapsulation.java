package ObjectOrientedProgramming;

public class JavaEncapsulation {
    private String name ;

    public String getName(){
        return name;
    }
    public void setName (String newName){
        this.name=newName;
    }
}

 class java extends JavaEncapsulation {
    public static void main(String[] args) {
        JavaEncapsulation ll = new JavaEncapsulation();
        ll.setName("vikas");
        System.out.println(ll.getName());
    }
}

