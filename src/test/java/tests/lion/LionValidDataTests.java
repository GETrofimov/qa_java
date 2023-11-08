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
public class LionValidDataTests {
    private String sex;
    private final boolean expected;
    private final int kittens;
    private Lion lion;


    public LionValidDataTests(String sex, int kittens, boolean expected) {
        this.sex  = sex;
        this.expected = expected;
        this.kittens = kittens;
        lion = null;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                {MALE, 2, true},
                {FEMALE, 0, false}
        };
    }

    @Before
    public void createLionExemplar() throws Exception {
            lion = new Lion(sex);
    }

    @Test
    public void doesHaveManeTest() {
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void setAndGetKittens() {
        lion.setKittens(kittens);
        int countKittens = lion.getKittens();
        assertEquals(kittens, countKittens);
    }

    @Test
    public void getFoodForLion() throws Exception {
        List<String> food = lion.getFood();
        assertEquals(PREDATOR_FOOD, food);
    }

}
