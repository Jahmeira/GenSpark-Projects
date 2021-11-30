import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
    }

    @Test
    void guessANumber() {
    }

    @Test
    void isFeedback() {
        assertEquals(true, main.isFeedback(2,2));
        assertEquals(false, main.isFeedback(0,2));
        assertEquals(false, main.isFeedback(5,2));

    }

    @Test
    void playAgain() {
        assertEquals(true, main.playAgain("y"));
        assertEquals(false, main.playAgain("n"));

    }
}