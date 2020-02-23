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
                    dinero.wait();
                    System.out.println("No hay dinero en el cajero");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("En este momento retiré 100 pesos");
        }
    }
}
