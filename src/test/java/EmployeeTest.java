
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


    @Test
    public void checkChangeSalary(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        Staff.add(emp1);

        float expected = 33000.0f;
        emp1.changeSalary(33000.0f);

        float actual = emp1.getSalary();

        assertEquals(expected, actual);

    }

    @Test
    public void checkRemoveEmployee(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 13, 28000.0f);
        Employeein emp2  = new Employeein("ben", "Abdul", 29, 2800.0f);
        Employeein emp3  = new Employeein("Steve", "Abdul", 43, 25000.0f);
        Employeein emp4  = new Employeein("Karl", "Abdul", 26, 29000.0f);
        Staff.add(emp1);
        Staff.add(emp2);
        Staff.add(emp3);
        Staff.add(emp4);


        Staff.remove(emp3);

        int expected = 3;
        int actual = Staff.size();


        assertEquals(expected, actual);


    }


    @Test
    public void increaseAllEmployeeSalary(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 13, 28000.0f);
        Employeein emp2  = new Employeein("ben", "Abdul", 29, 2800.0f);
        Employeein emp3  = new Employeein("Steve", "Abdul", 43, 25000.0f);
        Employeein emp4  = new Employeein("Karl", "Abdul", 26, 29000.0f);
        Staff.add(emp1);
        Staff.add(emp2);
        Staff.add(emp3);
        Staff.add(emp4);

        Iterator<Employeein> itr = Staff.iterator();
        while(itr.hasNext()){
            Employeein employee = itr.next();
            float a = employee.getSalary();
            float b = getIncreaseAmount();

        }

    }

}




