package progremmer_beginner.belajar_java_lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
    @NonNull
    private String id;
    @NonNull
    private String name;

    public String sayHallo(@NonNull String name){
        return "hallo" + name + "my name is " + this.name;
    }
}
