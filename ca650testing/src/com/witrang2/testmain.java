package com.witrang2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static junit.framework.TestCase.assertTrue;

public class testmain {

    private static Main c;


    @BeforeAll
    private static void beforeEach() {
        c = new Main();
    }

    @Test public void testCanAdd() {
        assertTrue(c.add(1, 2) == 3);
    }

    @Test public void testFailAdd() {
        assertTrue(c.failadd(1, 2) == 3);
    }
}