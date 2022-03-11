
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
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        assertTrue(s.getMyList().size() > 0);

    }

    @Test
    public void checkGetEmployeeFname(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);
        String expected = "lyban";

        String actual = s.getMyList().get(0).getFname();

        assertEquals(expected, actual);

    }


    @Test
    public void checkGetEmployeeEname(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        String expected = "Abdul";

        String actual = s.getMyList().get(0).getEname();

        assertEquals(expected, actual);


    }

    @Test
    public void checkIfEmployeeIdIsNotNull(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        int actual = s.getMyList().get(0).getEmployeeId();

        assertNotNull(actual);

    }

    @Test
    public void checkChangeFname() {
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        String expected = "Lars";
        s.getMyList().get(0).changeFname("Lars");

        String actual = s.getMyList().get(0).getFname();


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
        s.addEmployee("lyban", "Abdul", 23, 28000f);

        int expected = 23;

        int actual = s.getMyList().get(0).getAge();


        assertEquals(expected, actual);
    }


    @Test
    public void checkGetEmployeeSalary(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        float expected = 28000.0f;

        float actual = s.getMyList().get(0).getSalary();


        assertEquals(expected, actual);
    }


    @Test
    public void checkChangeEname(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        String expected = "Karl";
        s.getMyList().get(0).changeEname("Karl");

        String actual = s.getMyList().get(0).getEname();

        assertEquals(expected, actual);
    }

    @Test
    public void checkChangeAge(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        int expected = 20;
        s.getMyList().get(0).changeAge(20);

        int actual = s.getMyList().get(0).getAge();

        assertEquals(expected, actual);
    }


    @Test
    public void checkChangeSalary(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);

        float expected = 33000.0f;
        s.getMyList().get(0).changeSalary(33000.0f);

        float actual = s.getMyList().get(0).getSalary();

        assertEquals(expected, actual);

    }



    @Test
    public void increaseAllEmployeeSalary(){
        s.addEmployee("lyban", "Abdul", 13, 28000f);
        s.addEmployee("ben", "Abdul", 29, 2800f);
        s.addEmployee("Steve", "Abdul", 43, 25000f);
        s.addEmployee("Karl", "Abdul", 26, 29000f);

        s.increaseSalaryEveryOne(20);

        float expected1 = 33600f;
        float expected2 = 3360f;
        float expected3 = 30000f;
        float expected4 = 34800f;

        float actual1 = s.getMyList().get(0).getSalary();
        float actual2 = s.getMyList().get(1).getSalary();
        float actual3 = s.getMyList().get(2).getSalary();
        float actual4 = s.getMyList().get(3).getSalary();

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

        s.increaseSalaryForOne(2, 50);

        float expected = 37500f;
        float actual = s.getMyList().get(2).getSalary();



        assertEquals(expected, actual);





    }

}




