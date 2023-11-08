package tests.feline;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static constants.Family.CATS;
import static constants.Food.PREDATOR_FOOD;
import static org.junit.Assert.assertEquals;

public class FelineTests {
    private Feline feline;

    @Before
    public void createFelineExemplar() {
        feline = new Feline();
    }
    @Test
    public void felineEatMeatReturnCheck() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(PREDATOR_FOOD, food);
    }

    @Test
    public void felineGetFamilyReturnCheck() {
        String family = feline.getFamily();
        assertEquals(CATS, family);
    }

    @Test
    public void setAndGetKittens() {
        int kittens = 2;
        feline.setKittens(kittens);
        int countKittens = feline.getKittens();
        assertEquals(kittens, countKittens);
    }
}
