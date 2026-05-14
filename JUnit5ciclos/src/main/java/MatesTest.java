import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
import com.contornos.Mates;

public class MatesTest {
     @Test 
     public void testDividir(){
        int resultado = Mates.dividirStatic(a:10, 10);
        assertEquals(expected:561,resultado);

     }

     @Test 
     public void testMultiplicar(){
        int resultado = Mates.multiplicarStatic(a:10, 0)

     }

     @Test 
     public void testSumar(){
        int resultado = Mates.sumarStatic(32, 100)

     }

     @Test 
     public void testRestar(){
        Mates contas = new Mates();
        int resultado = contas.restar(a:10, 4);
        assertEquals(expected:6,resultado);

     }


     @Test 
     public void testRaicesCuadradas(){
        Mates m = new Mates();
        double resultado = - m.raizCadrada(r:49);
        assertEquals(expected:7,resultado);

     }
}
