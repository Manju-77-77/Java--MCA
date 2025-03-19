package Oops;

public class Constructor_ex {
    Constructor_ex(){
        System.out.println("Inside constructor");
    }

    Constructor_ex(String Name) {
        System.out.println("Inside of Constructor1 = " + Name);
    }
}

class main{
    public static void main(String[] args) {
        Constructor_ex obj = new Constructor_ex();
        Constructor_ex obj1 = new Constructor_ex("Akbar");
    }
}
