import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalExceptionTest {

    @Parameterized.Parameter()
    public String animalKind;

    @Parameterized.Parameters(name = "Animal Kind: {0}")
    public static Object[][] params() {
        return new Object[][]{{"Иной вид животного"}, {""}, {null}};
    }

    @Test
    public void getFoodExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> new Animal().getFood(animalKind));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

}
