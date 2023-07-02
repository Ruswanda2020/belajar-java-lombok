package progremmer_beginner.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {
    @Test
    void testWith() {

        var register =new Register("wanda","wanda");
        var register1=register.withUserName("wandi");

        Assertions.assertEquals(register.getPassword(),register1.getPassword());
        Assertions.assertNotEquals(register.getUserName(),register1.getUserName());

    }
}
