import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void add() {
        Sample sample = new Sample();
        int result = sample.add(2, 3);
        assertEquals(5, result);
    }
}