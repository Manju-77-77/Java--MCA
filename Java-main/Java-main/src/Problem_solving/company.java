package Problem_solving;

public class company { }

class emp1 extends company { }

class emp2 extends company { }

class Main {
    public static void main(String[] args) {
        emp2 e = new emp2();

        if (e instanceof emp2) {
            System.out.println("Instance of emp2");
        }
        if (e instanceof company) {
            System.out.println("Instance of company");
        }
    }
}
