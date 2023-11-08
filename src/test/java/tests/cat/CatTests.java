package tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static constants.Food.PREDATOR_FOOD;
import static constants.Sounds.CAT_SOUND;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    Feline feline;

    @Test
    public void catSoundTest() {
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        assertEquals(CAT_SOUND, sound);
    }

    @Test
    public void getFoodForCat() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(PREDATOR_FOOD);
        List<String> food = cat.getFood();
        assertEquals(PREDATOR_FOOD, food);
    }
}
