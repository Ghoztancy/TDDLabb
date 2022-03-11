
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest {

    // ** private ArrayList<Employeein> Staff = new ArrayList<>(); ** \\

    System s = new System();

    @Test
    public void checkIfEmpolyeeSystemContainsStaff(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 2300.0f);
        s.getMyList().add(emp1);

        assertTrue(s.getMyList().size() > 0);

    }

    @Test
    public void checkGetEmployeeFname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);
        String expected = "lyban";

        String actual = emp1.getFname();

        assertEquals(expected, actual);

    }


    @Test
    public void checkGetEmployeeEname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        String expected = "Abdul";

        String actual = emp1.getEname();

        assertEquals(expected, actual);


    }

    @Test
    public void checkIfEmployeeIdIsNotNull(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        int actual = emp1.getEmployeeId();

        assertNotNull(actual);

    }

    @Test
    public void checkChangeFname() {
        Employeein emp1 = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        String expected = "Lars";
        emp1.changeFname("Lars");

        String actual = emp1.getFname();


        assertEquals(expected, actual);
    }

    @Test
    public void checkAddEmployee() {
        s.addEmployee("lyban", "Abdul", 23, 28000.0f);
        int actual = s.getMyList().size();

        assertTrue(actual > 0);
    }

    @Test
    public void checkRemovedEmployee(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        s.removeEmployee(0);

        int expected = 0;

        int actual = s.getMyList().toArray().length;

        assertEquals(expected,actual);
    }

    @Test
    public void checkGetEmployeeAge(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        int expected = 23;

        int actual = emp1.getAge();


        assertEquals(expected, actual);
    }


    @Test
    public void checkGetEmployeeSalary(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        float expected = 28000.0f;

        float actual = emp1.getSalary();


        assertEquals(expected, actual);
    }


    @Test
    public void checkChangeEname(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        String expected = "Karl";
        emp1.changeEname("Karl");

        String actual = emp1.getEname();

        assertEquals(expected, actual);
    }

    @Test
    public void checkChangeAge(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        int expected = 20;
        emp1.changeAge(20);

        int actual = emp1.getAge();

        assertEquals(expected, actual);
    }


    @Test
    public void checkChangeSalary(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 23, 28000.0f);
        s.getMyList().add(emp1);

        float expected = 33000.0f;
        emp1.changeSalary(33000.0f);

        float actual = emp1.getSalary();

        assertEquals(expected, actual);

    }



    @Test
    public void increaseAllEmployeeSalary(){
        Employeein emp1  = new Employeein("lyban", "Abdul", 13, 28000f);
        Employeein emp2  = new Employeein("ben", "Abdul", 29, 2800f);
        Employeein emp3  = new Employeein("Steve", "Abdul", 43, 25000f);
        Employeein emp4  = new Employeein("Karl", "Abdul", 26, 29000f);
        s.getMyList().add(emp1);
        s.getMyList().add(emp2);
        s.getMyList().add(emp3);
        s.getMyList().add(emp4);


        s.increaseSalaryEveryOne(20);

        float expected1 = 33600f;
        float expected2 = 3360f;
        float expected3 = 30000f;
        float expected4 = 34800f;

        float actual1 = emp1.getSalary();
        float actual2 = emp2.getSalary();
        float actual3 = emp3.getSalary();
        float actual4 = emp4.getSalary();

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);



    }

    @Test
    public void increaseSalaryForOneEmployee(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);
        s.addEmployee("ben", "Abdul", 29, 2800f);
        s.addEmployee("Steve", "Abdul", 43, 25000f);
        s.addEmployee("Karl", "Abdul", 26, 29000f);

        s.increaseSalaryForOne(2);

        float expected = 37500f;
        float actual = s.getMyList().get(2).getSalary();



        assertEquals(expected, actual);





    }

}




