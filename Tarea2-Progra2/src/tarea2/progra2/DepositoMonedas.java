package tarea2.progra2;
import java.util.ArrayList;

public class DepositoMonedas{
    private final ArrayList<Moneda> a;

    public DepositoMonedas(){
        a = new ArrayList();
    }

    public void addMoneda(Moneda b){
        a.add(b);
    }

    public Moneda getMoneda(){
        if (a.isEmpty()){
            return null;
        }else{
            return a.remove(0);
        }
    }
}
