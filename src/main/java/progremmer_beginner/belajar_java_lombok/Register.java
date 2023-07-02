package progremmer_beginner.belajar_java_lombok;

import lombok.Value;
import lombok.With;

@Value
@With
public class Register {
    String userName;
    String password;
}
