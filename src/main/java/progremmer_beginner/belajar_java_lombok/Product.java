package progremmer_beginner.belajar_java_lombok;

import lombok.Data;

@Data
public class Product {

    private final String id;
    private String name;
    private String price;
}
