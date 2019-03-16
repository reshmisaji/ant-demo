package AntDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {

    @Test
    public void shouldDivideTwoNumbers(){
        assertEquals(2,Exception.divide(8,4));
    }
}