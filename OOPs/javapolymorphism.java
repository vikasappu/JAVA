package ObjectOrientedProgramming;

public class javapolymorphism {
    public void animalsound(){
        System.out.println("the animal makes a sound");

    }
}
class dog extends javapolymorphism{
    public  void animalsound(){
        System.out.println("the dogs like bow bow bow");
    }
}
class  cow extends javapolymorphism{
    public  void animalsound(){
        System.out.println("the cow sounds like hambow... hambow");
    }
}
class all {
    public static void main(String[] args) {
        javapolymorphism myanimal= new javapolymorphism();
        javapolymorphism mydog = new dog();
        javapolymorphism mycow =new cow();
        myanimal.animalsound();
        mydog.animalsound();
        mycow.animalsound();


    }
}
