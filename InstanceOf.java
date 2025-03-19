package Oops;

class bird { }

class parrot extends bird { }

public class InstanceOf {
    public static void main(String[] args) {
        parrot myparrot = new parrot();


        System.out.println(myparrot instanceof parrot);
        System.out.println(myparrot instanceof bird);
        System.out.println(myparrot instanceof Object);
    }
}

