package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client = new Client("Bohdan", 19, Gender.MALE, "shevdan007@gmail.com");

    @Test
    void getName() {
        assertEquals("Bohdan", client.getName());
    }

    @Test
    void getAge() {
        assertEquals(19, client.getAge());
    }

    @Test
    void getSex() {
    }

    @Test
    void getMail() {
        assertEquals(Gender.MALE, client.getSex());
    }
}