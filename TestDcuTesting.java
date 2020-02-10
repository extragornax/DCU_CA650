import org.junit.*;

public class TestDcuTesting {
    @Test
    public void testCanAdd(String[] args) {
        dcutesting c = new dcutesting();
        assertTrue(c.canadd(1, 2) == 3);
    } 
}