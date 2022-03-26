package pro.sky.java.course2.simplecalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorServiceImplTest {
    private final SimpleCalculatorServiceImpl out = new SimpleCalculatorServiceImpl();

    @Test
    void shouldReturn9WhenSummingUp6And3() {
        assertEquals(9,out.sumUpNumbers(6,3));
    }

    @Test
    void shouldReturn38WhenSummingUp36And2() {
        assertEquals(38,out.sumUpNumbers(36,2));
    }

    @Test
    void shouldReturn3WhenSubtracting3From6() {
        assertEquals(3,out.subtractNumbers(6,3));
    }


    @Test
    void shouldReturn36WhenSubtracting2From38() {
        assertEquals(36,out.subtractNumbers(38,2));
    }

    @Test
    void shouldReturn18WhenMultiplying6By3() {
        assertEquals(18,out.multiplyNumbers(6,3));
    }

    @Test
    void shouldReturn72WhenMultiplying36By2() {
        assertEquals(72,out.multiplyNumbers(36,2));
    }

    @Test
    void shouldReturn2WhenDividing6into3() {
        assertEquals(2,out.divideNumbers(6,3));
    }

    @Test
    void shouldReturn13WhenDividing36into2() {
        assertEquals(18,out.divideNumbers(36,2));
    }

    @Test
     void shouldReturnIllegalArgumentException() {
                assertThrows(IllegalArgumentException.class,
                () -> {
                    out.divideNumbers(2, 0);
                });
    }
}