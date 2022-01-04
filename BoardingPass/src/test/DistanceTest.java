import com.company.Distance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {
    Distance testDistance;

    @BeforeEach
    void setUp() {
    }

    @Test
    void location() {
        assertEquals(0, testDistance.kmeters(0, 0, 0, 0));
    }

    @AfterEach
    void tearDown() {
    }

}
