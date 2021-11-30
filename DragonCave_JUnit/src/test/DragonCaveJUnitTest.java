import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.*;

class DragonCaveJUnitTest {

    DragonCaveJUnit dragonCaveJUnit;

    @BeforeEach
    void setUp()
    {
        dragonCaveJUnit = new DragonCaveJUnit();
    }

    @Test
    void caves() {
        assertEquals("You've chosen the nice dragon. " +
                                "Congrats! You have treasure!", dragonCaveJUnit.caves(1));

        assertEquals("You have chosen the mean dragon. " +
                "You were eaten instantly and are DEAD.", dragonCaveJUnit.caves(2));

        assertEquals("Try again", dragonCaveJUnit.caves(0));
    }


    @AfterEach
    void tearDown() {

    }
}