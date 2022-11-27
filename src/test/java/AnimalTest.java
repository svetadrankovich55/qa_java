import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    @Parameterized.Parameter()
    public String animalKind;

    @Parameterized.Parameter(1)
    public List<String> listOfFood;

    @Parameterized.Parameters(name = "Animal kind: {0},List of food: {1}")
    public static Object[][] params() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(listOfFood, animal.getFood(animalKind));
    }

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
