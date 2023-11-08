package tests.lion;

import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static constants.ExceptionMessags.LION_EXCEPTION_MESSAGE;
import static constants.Sex.WRONG_GENDER;

public class LionInvalidDataTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void createLionWithWrongInput(){
        thrown.expect(Exception.class);
        thrown.expectMessage(LION_EXCEPTION_MESSAGE);
        try {
            Lion lion = new Lion(WRONG_GENDER);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}