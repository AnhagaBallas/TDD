import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class PhoneBookTest {
    @Test
    public void add() {
        Contact contact= Mockito.mock(Contact.class);
        Mockito.when(contact.getNumber()).thenReturn(123);
        Mockito.when(contact.getName()).thenReturn("Ivan");
        PhoneBook phoneBook = PhoneBook.getInstance();
        phoneBook.add(contact);
        String expected="Ivan";
        String granted=phoneBook.getMap().get(contact.getNumber());
        Assertions.assertEquals(expected,granted);

    }


}
