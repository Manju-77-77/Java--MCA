package Problem_solving;

class emp{
    private int Emp_id = 101;
    private String Emp_Name = "Akbar";
    private int Salary = 20000;
    private String Add = "xyz street";
    private String Phone;

    public String getPhone(){
        return Phone;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

}


public class emp_details {
    public static void main(String[] args) {
        emp ex = new emp();
        ex.setPhone("234335345");
        System.out.println(ex.getPhone());
    }

}
