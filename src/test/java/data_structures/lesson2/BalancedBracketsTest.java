package data_structures.lesson2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBracketsTest {

    @Test
    @DisplayName("Simple case")
    void testSimpleParentheses() {
        assertTrue(BalancedBrackets.isBalanced("()"));
    }

    @Test
    void testNestedDifferentTypes() {
        assertTrue(BalancedBrackets.isBalanced("([])"));
        assertTrue(BalancedBrackets.isBalanced("{[()]}"));
    }

    @Test
    void testIncorrectOrder() {
        assertFalse(BalancedBrackets.isBalanced("([)]"));
    }

    @Test
    void testSingleOpen() {
        assertFalse(BalancedBrackets.isBalanced("("));
    }

    @Test
    void testUnclosed() {
        assertFalse(BalancedBrackets.isBalanced("(()"));
    }

    @Test
    void testEmptyString() {
        assertTrue(BalancedBrackets.isBalanced(""));
    }
}