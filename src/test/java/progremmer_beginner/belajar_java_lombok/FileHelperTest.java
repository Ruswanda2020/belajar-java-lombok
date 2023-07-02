package progremmer_beginner.belajar_java_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FileHelperTest {
    @Test
    void testPom() throws Exception {
        var text=FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }

    @Test
    void fileNotFound() {
        Assertions.assertThrows(FileNotFoundException.class,() -> {
            FileHelper.loadFile("tidakada.txt");
       });
    }
}
