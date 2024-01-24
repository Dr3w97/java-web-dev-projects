package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    String emptyMessage = "String with open and closing brackets should return true";
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void stringWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("La[u]nchCode"));
    }
    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void stringWithOneBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch{code]"));
    }
    @Test
    public void onlyStringIsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LiftOff"));
    }
    @Test
    public void nullReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(null));
    }
    @Test
    public void bracketsInWrongOrderIsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("launch][code"));
    }
    @Test
    public void mulitpleSetsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void mulitpleSetsWithStringReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello][world]"));
    }
    @Test
    public void multipleSetsInWrongOrderIsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("hello[]wo]rld["));
    }
    @Test
    public void MultipleSetsWoStringInWrongOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][]]["));
    }
    @Test
    public void nestedBracketsIsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("[[]]")));
    }
}