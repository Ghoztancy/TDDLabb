
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class EmployeeTest {

    private ArrayList<Employeein> Staff = new ArrayList<>();

    @Test
    public void checkIfEmpolyeeSystemContainsStaff(){
        Employeein lyban  = new Employeein("lyban", "Abdul", 23, 2300.0f);
        Staff.add(lyban);

        assertTrue(Staff.size() > 0);
    }

}

