import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static PhoneBook INSTANCE = null;
    private Map<Integer, String> map = new HashMap<>();

    private PhoneBook() {
    }

    public static PhoneBook getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PhoneBook();
        }
        return INSTANCE;
    }

    public void add(Contact contact) {
        map.put(contact.getNumber(), contact.getName());
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}