
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

        int expected = 23;

        int actual = emp1.getAge();


        assertEquals(expected, actual);
    }


    @Test
    public void checkGetEmployeeSalary(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        float expected = 28000.0f;

        float actual = emp1.getSalary();


        assertEquals(expected, actual);
    }


    @Test
    public void checkIfEmployeeIdIsBetweenOneAndFourHundred(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        int actual = emp1.getEmployeeId();

        assertTrue(actual < 401 & 0 < actual);

    }

    @Test
    public void checkChangeFname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        String expected = "Lars";
        emp1.changeFname("Lars");

        String actual = emp1.getFname();


        assertEquals(expected, actual);


    }


    @Test
    public void checkChangeEname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        String expected = "Karl";
        emp1.changeEname("Karl");

        String actual = emp1.getEname();

        assertEquals(expected, actual);
    }

    @Test
    public void checkChangeAge(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        int expected = 20;
        emp1.changeAge(20);

        int actual = emp1.getAge();

        assertEquals(expected, actual);
    }

}




