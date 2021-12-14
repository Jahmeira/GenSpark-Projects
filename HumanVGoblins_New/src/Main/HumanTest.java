package Main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HumanTest {
    Human testHuman;

    @BeforeEach
    void setUp() {
        testHuman = new Human("Tester");
    }

    @Test
    void getName() {
        assertEquals("Tester", testHuman.getName());
    }

    @Test
    void setName() {
        testHuman.setName("TestThis");
        assertEquals("TestThis", testHuman.getName());
    }

    @Test
    void getHealth() {
        testHuman.setName("TestThis");
        assertEquals("TestThis", testHuman.getName());
    }

    @Test
    void setHealth() {
        testHuman.setHealth(1000);
        assertEquals(1000, testHuman.getHealth());
    }

    @Test
    void getAttack() {
        assertEquals(8, testHuman.getAttack());
    }

    @Test
    void setAttack() {
        testHuman.setAttack(10);
        assertEquals(10, testHuman.getAttack());
    }

    @Test
    void getDefense() {
        assertEquals(10, testHuman.getDefense());
    }

    @Test
    void setDefense() {
        testHuman.setDefense(12);
        assertEquals(12, testHuman.getDefense());
    }

    @Test
    void getLuck() {
        assertEquals(3, testHuman.getLuck());
    }

    @Test
    void setLuck() {
        testHuman.setLuck(4);
        assertEquals(4, testHuman.getLuck());
    }

    @Test
    void getGold() {
        assertEquals(0, testHuman.getGold());
    }

    @Test
    void setGold() {
        testHuman.setGold(100);
        assertEquals(100, testHuman.getGold());
    }

    @Test
    void getLevel() {
        assertEquals(1, testHuman.getLevel());
    }

    @Test
    void setLevel() {
        testHuman.setLevel(2);
        assertEquals(2, testHuman.getLevel());
    }

    @Test
    void testToString() {
        assertEquals("Human: { Name: Tester, Level: 1, Health: 900, Attack: 8, Defense: 10, Luck: 3, Inventory: [Empty], Gold: 0}",
                testHuman.toString());
    }
}