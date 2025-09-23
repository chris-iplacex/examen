import cl.iplacex.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraAT {
    private final Calculadora calc = new Calculadora();
    @Test
    public void dividir_ok() {
        assertEquals(4, calc.dividir(20, 5));
    }
    @Test
    public void dividir_por_0() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(1, 0));
    }
}

