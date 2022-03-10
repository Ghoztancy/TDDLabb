import java.util.Random;

public class Employeein {
    Random rand = new Random();
    private String Fname;
    private String Ename;
    private int Age;
    private int EmployeeId;
    private float Salary;

     public Employeein(String Fname, String Ename, int Age, float Salary){
         this.Fname = Fname;
         this.Ename = Ename;
         this.Age = Age;
         this.Salary = Salary;
         int n = rand.nextInt(400);
         EmployeeId = n+1;
     }

     public String getFname(){
         return Fname;
     }

    public String getEname(){
        return Ename;
    }

    public int getAge(){
        return Age;
    }

    public Float getSalary(){
        return Salary;
    }

    public int getEmployeeId(){
        return EmployeeId;
    }

    public void changeFname(String name){
         Fname = name;
    }

    public void changeEname(String name){
        Ename = name;
    }

    public void changeAge(int age){
        Age = age;
    }

    public void changeSalary(float salary){
         Salary = salary;
    }

    public void increaseSalary(double amount){
         if(amount < 100 & amount > 0){
           double a = amount + 100;
           double b = a * 0.01;
           double c = (double)Salary;
           double d = c * b;
           Salary = (float)d;
         }
    }

}
