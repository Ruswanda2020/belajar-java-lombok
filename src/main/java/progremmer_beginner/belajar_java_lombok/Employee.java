package progremmer_beginner.belajar_java_lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Employee {
    private String id;
    private String name;
}
