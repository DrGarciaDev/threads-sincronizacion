import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Depositar implements Runnable{
    List<String> dinero;
    public Depositar(List<String> dinero){
        this.dinero = dinero;
    }
    public void run(){
        while(true){
            try {
                Thread.sleep(2000);
                synchronized(dinero){
                    SuperClase.saldo = SuperClase.saldo + 100;
                    dinero.notify();
                    System.out.println("En este momento se depositaron 100 $");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Depositar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
