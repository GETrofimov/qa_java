package tests.lion;

import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static constants.Food.PREDATOR_FOOD;
import static constants.Sex.FEMALE;
import static constants.Sex.MALE;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTests {
    private String sex;
    private final boolean expected;
    private int kittens;
    private Lion lion;


    public LionTests(String sex, int kittens, boolean expected) throws Exception {
        this.sex  = sex;
        this.expected = expected;
        this.kittens = kittens;
        lion = null;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                {MALE, 3, true},
                {FEMALE, 0, false},
                {"Male", 0, false}
        };
    }

    @Before
    public void createLionExemplar() throws Exception {
            lion = new Lion(sex, kittens);
    }

    @Test(expected = Exception)
    public void doesHaveManeTest() throws Exception {
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveKittens() throws Exception {
        int actualKittens = lion.getKittens();
        assertEquals(kittens, actualKittens);
    }

    @Test
    public void getFoodForLion() throws Exception {
        List<String> food = lion.getFood();
        assertEquals(PREDATOR_FOOD, food);
    }

}
