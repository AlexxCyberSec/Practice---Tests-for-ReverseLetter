package reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void reverse_shouldReverseString_ifContainsString() {
        String result = reverse.reverse("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverse_shouldReturnEmptyString_ifContainsNull() {
        String result = reverse.reverse(null);
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverse_shouldRerurnEmptyString_ifStringIsEmpty() {
        String result = reverse.reverse("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverse_shouldRerurnA_ifStringIsA() {
        String result = reverse.reverse("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void reverse_shouldReturnString_ifNoContainsChars() {
        String result = reverse.reverse("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void reverse_shouldReverseString_ifContainsOnlyChars() {
        String result = reverse.reverse("abcd");
        Assertions.assertEquals("dcba", result);
    }

    @Test
    public void reverse_shouldReturnNoCharsOnThesePositions() {
        String result = reverse.reverse("!aa@bb?");
        Assertions.assertEquals("!bb@aa?", result);
    }

    @Test
    public void reverse_shouldReturnRightRegister() {
        String result = reverse.reverse("AbCdE");
        Assertions.assertEquals("EdCbA", result);
    }
}
