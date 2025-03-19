package Oops;

import java.util.Scanner;

// Implementation of abstraction
abstract class softwares{
    String user_name;
    String password;

    void user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Username :");
        user_name = sc.nextLine();
        System.out.println("Enter a Password");
        password = sc.nextLine();
    }

    void User_login(){
        System.out.println("Welcome To Instagram");
        System.out.println("--------------------");
        System.out.println("Please Login Here...!!");
    }
    abstract void app_open();
}

class Insta extends softwares{
    @Override
    void app_open() {
        while (true){
            if (user_name.equals("Akbar") && password.equals("123akbar")){
                System.out.println("Successfully Login,App Is Open...");
                break;
            }
            else{
                System.out.println("Invalid username or password :(");
                user_input();
            }
        }
    }
}

public class Apps {
    public static void main(String[] args) {
        Insta s = new Insta();
        s.User_login();
        s.user_input();
        s.app_open();

    }
}
