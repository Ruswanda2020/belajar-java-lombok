package progremmer_beginner.belajar_java_lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Merchant {

    private final String id;
    private String name;
}
