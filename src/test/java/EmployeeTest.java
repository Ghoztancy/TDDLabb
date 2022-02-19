import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {



    @BeforeAll
    static void beforeAll() {
        employee person = new employee();
    }

    @Test
    public void checkIfEmployeeIsNotNull(){
        employee("Liban", "Abdulkadir", "4", "23000" );

    }

}

