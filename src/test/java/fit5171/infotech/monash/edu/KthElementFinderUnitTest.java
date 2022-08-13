package  fit5171.infotech.monash.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/* @author Yuan-Fang Li and Ayesha Sadiq
 */
public class KthElementFinderUnitTest {
    private KthElementFinder finder;

    @BeforeEach
    public void setUp() {
        finder = new KthElementFinder();
    }

/*    @Test()
    public void throwsExceptionForNullArray() {
    	  finder.find(null, 1);
    }*/
    @Test()
    @DisplayName("input array is null")
    public void throwsExceptionForNullArray() {
        int[] array = null;
        int b = 0;
        Throwable exception = assertThrows(java.lang.IllegalArgumentException.class, () -> {
            finder.find(array, b);
        });
        assertEquals("Null array not supported.", exception.getMessage());
    }

    @Test()
    @DisplayName("check result if it's expected")
    public void checkExpectedResult(){
        int[] a = {-23, -5, -56, 60, 4};
        int b = 3;
        assertEquals(-5,finder.find(a,b));
    }

    public int find(int[] array, int k) {
        if (null == array) {
            throw new IllegalArgumentException("Null array not supported.");
        }
        Arrays.sort(array);
        return array[array.length-k];
    }


}


