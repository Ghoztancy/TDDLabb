import java.util.Random;

public class Employeein {
    private String Fname;
    private String Ename;
    private int Age;
    private int EmployeeId;
    private float Salary;


     public Employeein(String Fname, String Ename, int Age, float Salary){
         Random rand = new Random(30000);
         this.Fname = Fname;
         this.Ename = Ename;
         this.Age = Age;
         this.Salary = Salary;
         EmployeeId = rand.nextInt();

     }

     public String getFname(){
         return Fname;
     }


}
