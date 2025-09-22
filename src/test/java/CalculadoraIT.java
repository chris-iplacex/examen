import cl.iplacex.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIT {
    @Test
    void sumar_integration() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }
}