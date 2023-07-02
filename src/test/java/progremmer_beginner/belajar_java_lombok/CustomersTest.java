package progremmer_beginner.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomersTest {
    @Test
    void customersTest() {
        Customers customers=new Customers();
        customers.setId("2");
        customers.setName("wanda");

        System.out.println(customers.getId());
        System.out.println(customers.getName());
    }

    @Test
    void testCustomerConstructor() {
        var constructor=new Customers("id","name");
        Assertions.assertEquals("id",constructor.getId());
        Assertions.assertEquals("name",constructor.getName());
    }

    @Test
    void testEquals() {
        var customer1=new Customers("id","name 1");
        var customer2=new Customers("id","name 2");

        Assertions.assertEquals(customer1,customer2);
        Assertions.assertEquals(customer1.hashCode(),customer2.hashCode());
    }
}
