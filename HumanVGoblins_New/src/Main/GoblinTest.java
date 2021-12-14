package Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class GoblinTest {
    Goblin testGoblin;

    @BeforeEach
    void setUp() {
        testGoblin = new Goblin("Tester");
    }

    @Test
    void getName() {
        assertEquals("Tester", testGoblin.getName());
    }

    @Test
    void setName() {
        testGoblin.setName("TestThis");
        assertEquals("TestThis", testGoblin.getName());
    }

    @Test
    void getHealth() {
        testGoblin.setName("TestThis");
        assertEquals("TestThis", testGoblin.getName());
    }

    @Test
    void setHealth() {
        testGoblin.setHealth(1000);
        assertEquals(1000, testGoblin.getHealth());
    }

    @Test
    void getAttack() {
        assertEquals(10, testGoblin.getAttack());
    }

    @Test
    void setAttack() {
        testGoblin.setAttack(10);
        assertEquals(10, testGoblin.getAttack());
    }

    @Test
    void getDefense() {
        assertEquals(8, testGoblin.getDefense());
    }

    @Test
    void setDefense() {
        testGoblin.setDefense(12);
        assertEquals(12, testGoblin.getDefense());
    }

    @Test
    void getLuck() {
        assertEquals(2, testGoblin.getLuck());
    }

    @Test
    void setLuck() {
        testGoblin.setLuck(4);
        assertEquals(4, testGoblin.getLuck());
    }

    @Test
    void setGold() {
        testGoblin.setGold(100);
        assertEquals(100, testGoblin.getGold());
    }

    @Test
    void getLevel() {
        assertEquals(0, testGoblin.getLevel());
    }

    @Test
    void setLevel() {
        testGoblin.setLevel(2);
        assertEquals(2, testGoblin.getLevel());
    }

    @Test
    void testToString() {
        assertEquals("Goblin: { Name: Tester, Level: 0, Health: 1100, Attack: 10, Defense: 8, Luck: 2}",
                testGoblin.toString());
    }

}