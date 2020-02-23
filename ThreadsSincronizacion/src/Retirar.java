import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Retirar implements Runnable{
    List<String> dinero;
    public Retirar(List<String> dinero){
        this.dinero = dinero;
    }
    
    @Override
    public void run(){
        synchronized (dinero) {
            if(SuperClase.saldo == 0.0){
                try {
                    System.out.println("Hola soy " + Thread.currentThread().getName() + " No hay dinero en el cajero");
                    dinero.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            SuperClase.saldo = SuperClase.saldo - 100;
            System.out.println("En este momento " + Thread.currentThread().getName() + " retiró 100 pesos");
        }
    }
}
