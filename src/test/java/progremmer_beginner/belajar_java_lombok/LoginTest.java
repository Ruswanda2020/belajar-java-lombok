package progremmer_beginner.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    void testLogin() {

        var login= Login.creat("wanda", "rahasia");
        Assertions.assertEquals("wanda",login.getUserName());
        Assertions.assertEquals("rahasia",login.getPassword());

        var login1= Login.creatEmpty();
        Assertions.assertNull(login1.getUserName());
        Assertions.assertNull(login1.getPassword());
    }

    @Test
    void testToString() {
        var login =Login.creat("eko","rahasia");
        System.out.println(login);
    }
}

