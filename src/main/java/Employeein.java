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


}
