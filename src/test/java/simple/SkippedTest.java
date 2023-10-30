package simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
@Tag("simple")
public class SkippedTest {
    @Test
    void skippedTest1(){
        assertTrue(true);
    }

    @Test
    void skippedTest2(){
        assertTrue(true);
    }

    @Test
    void skippedTest3(){
        assertTrue(true);
    }

    @Test
    void skippedTest4(){
        assertTrue(true);
    }

}
