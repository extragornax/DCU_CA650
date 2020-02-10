package com.witrang2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;

public class testStack {

    private MyStack s;

    @BeforeEach
    private void beforeEach() {
        s = new MyStack();
    }

    @Test
    public void testStackPush() {
        s.push(12);
        s.push(12);
        assertTrue(s.size() == 2);
    }

    @Test
    public void testPop() {
        s.push(1);
        s.push(2);
        assertTrue(s.pop() == 2);
        assertTrue(s.pop() == 1);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(s.isEmpty() == true);
    }
}
