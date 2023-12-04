package net.claymitchell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DefaultTest {

    @Test
    void defaultTrue() {
        assertTrue(DefaultClass.trueMethod());
    }

    @Test
    void defaultFalse() {
        assertFalse(DefaultClass.falseMethod());
    }
}
