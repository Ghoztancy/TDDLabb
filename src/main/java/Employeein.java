import java.util.Random;

public class Employeein {
     String Fname;
     String Ename;
     int Age;
     int EmployeeId;
     float Salary;

     public Employeein(String Fname, String Ename, int Age, float Salary){
         this.Fname = Fname;
         this.Ename = Ename;
         this.Age = Age;
         this.Salary = Salary;
         Random rand = new Random(30000);
         EmployeeId = rand.nextInt();
     }

}
