package Oops;

public class Method_Overloading {
    public static void add(){
        System.out.println("Addition");
    }
    int add1(String Name){
        System.out.println(Name);
        return 0;
    }

}

class main1{
    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.add();
        obj.add1("Akbar");
    }
}
