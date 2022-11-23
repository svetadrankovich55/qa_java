import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    @Test
    public void GetKittensTest() throws Exception {
        LionAlex alexLion = new LionAlex(feline);
        Assert.assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex alexLion = new LionAlex(feline);
        Assert.assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жирафа Мелман"), alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex alexLion = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

}
