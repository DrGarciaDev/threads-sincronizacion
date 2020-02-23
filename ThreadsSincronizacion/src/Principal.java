
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
        Thread cliente1 = new Thread(ret,"Juan");
        Thread cliente2 = new Thread(ret,"Jose");
        Thread cliente3 = new Thread(ret,"Javier");
        Thread cliente4 = new Thread(ret,"Jonas");
        Thread cliente5 = new Thread(ret,"Jorge");
        Thread cajero   = new Thread(dep,"CAJERO PEDRO");
        
        hsal.start();
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        cajero.start();
    }
}
