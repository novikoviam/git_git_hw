package git_hw_guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest() {
        Assertions.assertTrue(new Random().nextInt() > 1);
    }
    @Test
    void exampleTest() {
        Assertions.assertTrue(new Random().nextInt() >2);
    }
}
