import com.company.TicketPrice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketPriceTest {
    TicketPrice testPriceTicket;

    @BeforeEach
    void setUp() {
    }

    @Test
    void bPN() {
        assertEquals(37.00, testPriceTicket.price(100.0, 10, "F"));
    }

    @AfterEach
    void tearDown() {
    }
}
