package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
@Tag("simple")
public class SkippedTest {
    @Test
    @Disabled
    void skippedTest1(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void skippedTest2(){
        assertTrue(true);
    }

    @Test
    @Disabled("Some reason")
    void skippedTest3(){
        assertTrue(true);
    }

    @Test@Disabled("Some reason")

    void skippedTest4(){
        assertTrue(true);
    }

}
