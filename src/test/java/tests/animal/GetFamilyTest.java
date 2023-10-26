package tests.animal;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFamilyTest {
    @Test
    public void getFamilyResultCheck() {
        Animal animal = new Animal();
        String actual =  animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}
