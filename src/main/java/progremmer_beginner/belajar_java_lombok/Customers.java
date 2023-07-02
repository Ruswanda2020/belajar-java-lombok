package progremmer_beginner.belajar_java_lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "name")
public class Customers {

    private String id;
    private String name;
}
