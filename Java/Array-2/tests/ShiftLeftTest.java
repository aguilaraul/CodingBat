import org.junit.Test;

import static org.junit.Assert.*;

public class ShiftLeftTest {
    ShiftLeft sl = new ShiftLeft();

    @Test
    public void shiftLeft() {
        int[] set1 = {6, 2, 5, 3};
        int[] set2 = {1, 2};
        int[] set3 = {1};
        int[] set4 = {};
        int[] set5 = {1, 1, 2, 2, 4};
        int[] set6 = {1, 1, 1};
        int[] set7 = {1, 2, 3};

        int[] eset1 = {2, 5, 3, 6};
        int[] eset2 = {2, 1};
        int[] eset3 = {1};
        int[] eset4 = {};
        int[] eset5 = {1, 2, 2, 4, 1};
        int[] eset6 = {1, 1, 1};
        int[] eset7 = {2, 3, 1};


        assertArrayEquals(eset1, sl.shiftLeft(set1));
        assertArrayEquals(eset2, sl.shiftLeft(set2));
        assertArrayEquals(eset3, sl.shiftLeft(set3));
        assertArrayEquals(eset4, sl.shiftLeft(set4));
        assertArrayEquals(eset5, sl.shiftLeft(set5));
        assertArrayEquals(eset6, sl.shiftLeft(set6));
        assertArrayEquals(eset7, sl.shiftLeft(set7));
    }
}