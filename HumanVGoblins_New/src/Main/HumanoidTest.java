package Main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HumanoidTest {
    Humanoid testHumanoid;

    @BeforeEach
    void setUp() {
        testHumanoid = new Humanoid();
    }

    @Test
    void getName() {
        assertNull(null, testHumanoid.getName());
    }

    @Test
    void setName() {
        testHumanoid.setName("Test");
        assertEquals("Test", testHumanoid.getName());
    }

    @Test
    void getHealth() {
        assertEquals(0, testHumanoid.getHealth());
    }

    @Test
    void setHealth() {
        testHumanoid.setHealth(1000);
        assertEquals(1000, testHumanoid.getHealth());
    }

    @Test
    void getAttack() {
        assertEquals(0, testHumanoid.getAttack());
    }

    @Test
    void setAttack() {
        testHumanoid.setAttack(10);
        assertEquals(10, testHumanoid.getAttack());
    }

    @Test
    void getDefense() {
        assertEquals(0, testHumanoid.getDefense());
    }

    @Test
    void setDefense() {
        testHumanoid.setDefense(10);
        assertEquals(10, testHumanoid.getDefense());
    }

    @Test
    void getLuck() {
        assertEquals(0, testHumanoid.getLuck());
    }

    @Test
    void setLuck() {
        testHumanoid.setLuck(10);
        assertEquals(10, testHumanoid.getLuck());
    }

    @Test
    void getGold() {
        assertEquals(0, testHumanoid.getGold());
    }

    @Test
    void setGold() {
        testHumanoid.setGold(100);
        assertEquals(100, testHumanoid.getGold());
    }

    @Test
    void getLevel() {
        assertEquals(0, testHumanoid.getLevel());
    }

    @Test
    void setLevel() {
        testHumanoid.setLevel(10);
        assertEquals(10, testHumanoid.getLevel());
    }
}