import static org.junit.jupiter.api.Assertions.*;

import com.company.BoardingPassNumber;
import org.junit.jupiter.api.*;

public class BoardingPassNumberTest {
    BoardingPassNumber testBoardingPassNumber;

    @BeforeEach
    void setUp() {
    }

    @Test
    void bPN() {
        assertEquals("testjan012022111", testBoardingPassNumber.bPN("test", "jan012022", 111.111));
    }

    @AfterEach
    void tearDown() {
    }

}
