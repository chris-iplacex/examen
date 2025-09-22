import cl.iplacex.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();
    @Test
    public void sumar_ok() {
        assertEquals(5, calc.sumar(2, 3));
    }
    @Test
    public void restar_ok() {
        assertEquals(6, calc.restar(10, 4));
    }
    @Test
    public void multiplicar_ok() {
        assertEquals(42, calc.multiplicar(7, 6));
    }
    @Test
    public void dividir_ok() {
        assertEquals(4, calc.dividir(20, 5));
    }
    @Test
    public void dividir_por_0() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(1, 0));
    }
}

