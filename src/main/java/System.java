import java.util.ArrayList;
import java.util.Iterator;

public class System {
    int uniqueInt = 0;
    private ArrayList<Employeein> Staff = new ArrayList<>();

    public ArrayList<Employeein> getMyList(){
        return Staff;
    }

    public int newId(){
        uniqueInt = uniqueInt + 1;
        return uniqueInt;
    }


    public void increaseSalary(int a){
        Iterator<Employeein> itr = getMyList().iterator();
        while(itr.hasNext()){
            Employeein employee = itr.next();
            employee.increaseSalary(a);
        }
    }


}




