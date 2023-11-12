package lv.id.jc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FooTest {
    @Test
    public void testBar_BothNumbersPositive() {
        Foo foo = new Foo();
        int result = foo.bar(7, 3);
        assertEquals(7, result, "Expected the value of x");
    }
}
