import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
   Passenger passenger;

    @BeforeEach
    void setUp() {
       passenger = new Passenger();
    }

    @Test
    void getName() {
     assertNull(passenger.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    passenger.setName("Parker, Peter");
     assertEquals("Parker, Peter", passenger.getName());

    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertNull(passenger.getEmail());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        passenger.setEmail("legos@gmail.com");
        assertEquals("legos@gmail.com", passenger.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(0,passenger.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        passenger.setAge(24);
        assertEquals(24, passenger.getAge());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        assertNull(passenger.getGender());
    }

    @org.junit.jupiter.api.Test
    void setGender() {
        passenger.setGender("F");
        assertEquals("F", passenger.getGender());
    }

    @org.junit.jupiter.api.Test
    void getPhoneNum() {
        assertNull(passenger.getPhoneNum());
    }

    @org.junit.jupiter.api.Test
    void setPhoneNum() {
       passenger.setPhoneNum("000-000-0000");//
       assertEquals("000-000-0000", passenger.getPhoneNum());
    }

    @AfterEach
    void tearDown() {
    }

}