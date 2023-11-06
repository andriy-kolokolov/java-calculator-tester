import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ticket test")
class TicketTest {

    @Test
    @DisplayName("can create ticket")
    void testTicketCreation() {
        assertDoesNotThrow(() -> new Ticket(100, 25));
    }

    @Test
    @DisplayName("throws exception if distance is negative number")
    void testTicketCreationWithInvalidDistance() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Ticket(-1, 25));
        assertEquals("Distance and age must be positive numbers and not equal to zero.", exception.getMessage());
    }

    @Test
    @DisplayName("throws exception if age is negative number")
    void testTicketCreationWithInvalidAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Ticket(100, -1));
        assertEquals("Distance and age must be positive numbers and not equal to zero.", exception.getMessage());
    }

    @Test
    @DisplayName("throws exception if distance is 0")
    void testTicketCreationWithZeroDistance() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 25));
        assertEquals("Distance and age must be positive numbers and not equal to zero.", exception.getMessage());
    }

    @Test
    @DisplayName("throws exception if age is 0")
    void testTicketCreationWithZeroAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Ticket(100, 0));
        assertEquals("Distance and age must be positive numbers and not equal to zero.", exception.getMessage());
    }

    @Test
    @DisplayName("can calculate adult price")
    void testCalculatePriceForAdult() {
        Ticket ticket = new Ticket(100, 25);
        assertEquals(30.0, ticket.calculatePrice(), 0.01);
    }

    @Test
    @DisplayName("can calculate children price with 50% discount")
    void testCalculatePriceForChild() {
        Ticket ticket = new Ticket(100, 11);
        assertEquals(15.0, ticket.calculatePrice(), 0.01);
    }

    @Test
    @DisplayName("can calculate senior price with 70% discount")
    void testCalculatePriceForSenior() {
        Ticket ticket = new Ticket(100, 65);
        assertEquals(21.0, ticket.calculatePrice(), 0.01);
    }
}
