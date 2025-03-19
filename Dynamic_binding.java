package Oops;


class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("BOW BOW");
    }
}


public class Dynamic_binding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
