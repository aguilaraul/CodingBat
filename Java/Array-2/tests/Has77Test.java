import org.junit.Test;

import static org.junit.Assert.*;

public class Has77Test {
    Has77 has77 = new Has77();

    @Test
    public void has77() {
        int[] set1 = {1, 7, 7};
        int[] set3 = {1, 7, 1, 1, 7};
        int[] set2 = {1, 7, 1, 7};

        assertTrue(has77.has77(set1));
        assertTrue(has77.has77(set2));
        assertFalse(has77.has77(set3));
    }
}