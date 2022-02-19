
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EmployeeTest {

    private ArrayList<Employeein> Staff = new ArrayList<>();

    @Test
    public void checkIfEmpolyeeSystemContainsStaff(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 2300.0f);
        Staff.add(emp1);

        assertTrue(Staff.size() > 0);


    }

    @Test
    public void checkGetEmployeeFname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);
        String expected = "lyban";

        String actual = emp1.getFname();

        assertEquals(expected, actual);

    }


    @Test
    public void checkGetEmployeeEname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        String expected = "Abdul";

        String actual = emp1.getEname();

        assertEquals(expected, actual);


    }

    @Test
    public void checkGetEmployeeAge(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        int expected = 22;

        int actual = emp1.getAge();


        assertEquals(expected, actual);
    }






}

