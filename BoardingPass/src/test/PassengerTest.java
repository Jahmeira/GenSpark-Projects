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
     assertEquals("null, null ", Passenger.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    Passenger.setName();
     assertEquals("null, null ", Passenger.getName());

    }

    @org.junit.jupiter.api.Test
    void getEmail() {
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        assertEquals("M", Passenger.getGender());
    }

    @org.junit.jupiter.api.Test
    void setGender() {
        Passenger.setGender("F");
        assertEquals("F", Passenger.getGender());
    }

    @org.junit.jupiter.api.Test
    void getPhoneNum() {
        assertEquals("000-000-0000", Passenger.getPhoneNum());
    }

    @org.junit.jupiter.api.Test
    void setPhoneNum() {
       Passenger.setPhoneNum("000-000-0000");
       assertEquals("000-000-0000", Passenger.getPhoneNum());
    }

    @AfterEach
    void tearDown() {
    }

}