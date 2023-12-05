package net.claymitchell.neetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductExceptSelfTest {

    ProductExceptSelf pes = new ProductExceptSelf();

    @Test
    void sequential() {
        int[] input = new int[] {1,2,3,4};
        int[] answers = pes.productExceptSelf(input);
        assertEquals(24, answers[0]);
        assertEquals(12, answers[1]);
        assertEquals(8, answers[2]);
        assertEquals(6, answers[3]);
    }

}
