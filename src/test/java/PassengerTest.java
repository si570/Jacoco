import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    void shouldThrowExceptionForInvalidTitle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Passenger("Doctor", "John", "Smith"));
        assertEquals("Invalid title. Must be Mr, Mrs, or Ms.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForShortFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Passenger("Mr", "Jo", "Smith"));
        assertEquals("First name must be at least 3 characters long.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForShortLastName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Passenger("Mr", "John", "Sm"));
        assertEquals("Last name must be at least 3 characters long.", exception.getMessage());
    }

    @Test
    void shouldCreateValidPassenger() {
        Passenger p = new Passenger("Mrs", "Anna", "Jones");
        assertEquals("Mrs", p.getTitle());
        assertEquals("Anna", p.getFirstName());
        assertEquals("Jones", p.getLastName());
    }
}

