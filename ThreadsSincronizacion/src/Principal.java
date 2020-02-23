
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis_
 */
public class Principal {
    public static void main(String[] args){
        List<String> dinero;
        dinero          = new ArrayList<>();
        Saldo sal       = new Saldo();
        Thread hsal     = new Thread(sal);
        Retirar ret     = new Retirar(dinero);
        Depositar dep   = new Depositar(dinero);
        Thread cliente1 = new Thread(ret);
        Thread cliente2 = new Thread(ret);
        Thread cliente3 = new Thread(ret);
        Thread cliente4 = new Thread(ret);
        Thread cliente5 = new Thread(ret);
        Thread cajero   = new Thread(dep);
        
        hsal.start();
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        cajero.start();
    }
}
