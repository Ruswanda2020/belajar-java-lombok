package progremmer_beginner.belajar_java_lombok;

import lombok.*;

@Getter
@AllArgsConstructor(staticName = "creat")
@NoArgsConstructor(staticName = "creatEmpty")
@ToString(exclude = "password")
public class Login {
    @Setter(value = AccessLevel.PROTECTED)
    private String userName;
    @Setter(value = AccessLevel.PROTECTED)
    private String password;
}
