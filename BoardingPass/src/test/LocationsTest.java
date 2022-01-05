//import com.company.Locations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationsTest {
    Locations testLocations;

    @BeforeEach
    void setUp() {
    }

    @Test
    void location() {
        assertEquals(0, testLocations.location("AK", "AK"));
    }

    @AfterEach
    void tearDown() {
    }

}
