import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class FelineTest {

   @Test
    public void EatMeatTest() throws Exception {
        Feline feline = new Feline();
       Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void GetFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void GetKittensTest() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParametersTest() {
        Feline feline = new Feline();
        Assert.assertEquals(100, feline.getKittens(100));
    }

}
