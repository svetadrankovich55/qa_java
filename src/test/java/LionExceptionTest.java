import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionExceptionTest {

    @Parameterized.Parameter()
    public String sex;

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "Lion sex: {0}")
    public static Object[][] params() {
        return new Object[][]{{"male"}, {"female"}, {""}, {null}};
    }

    @Test
    public void lionExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(sex, feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
