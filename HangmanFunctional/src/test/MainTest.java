import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pickALetter() {
    }

    @Test
    void hangman() {
    }

    @Test
    void isComputerWordAnswer() {
    }

    @Test
    void startMakingHangman() {
    }

    @Test
    void playAgain() {

        assertEquals("y", main.playAgain, "Incorrect input");
        assertEquals("n", main.playAgain, "Incorrect input");
    }
}