import java.util.ArrayList;
import java.util.Calendar;

public class System {

    private ArrayList<Employeein> Staff = new ArrayList<>();

    public ArrayList<Employeein> getMyList(){
        return Staff;
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




