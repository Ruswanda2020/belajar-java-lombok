package progremmer_beginner.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    @Test
    void testConstructorNull() {
        Assertions.assertThrows(NullPointerException.class,() -> {
            var member=new Member(null,null);
        });
    }
    @Test
    void testSetterNull() {
        Assertions.assertThrows(NullPointerException.class,() -> {
            var member=new Member("wanda","wanda");
            member.setName(null);

        });
    }
    @Test
    void testMethodNull() {
        Assertions.assertThrows(NullPointerException.class,() -> {
            var member=new Member("wanda","wanda");
            member.sayHallo(null);

        });
    }
}
