package progremmer_beginner.belajar_java_lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {
    @Test
    void createViaConstructor() {
        var hobbies=new ArrayList<String>();
        hobbies.add("read");
        hobbies.add("game");
        hobbies.add("traveling");
        var person=new Person("id","name",30,hobbies);
    }
    @Test
    void createViaSetter() {
        var hobbies=new ArrayList<String>();
        hobbies.add("read");
        hobbies.add("game");
        hobbies.add("traveling");

        var person =new Person();
        person.setId("ID");
        person.setName("name");
        person.setAge(30);
        person.setHobbies(hobbies);
    }
    @Test
    void createViaBuilder() {

        var person=Person.builder()
                .id("ID")
                .name("NAME")
                .age(30)
                .hobby("game")
                .hobby("read")
                .hobby("run")
                .build();

        System.out.println(person);

    }
}
