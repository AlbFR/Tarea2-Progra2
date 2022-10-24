package tarea2.progra2;
import java.util.ArrayList;

public class Deposito{
    private final ArrayList<Bebida> a;
    public Deposito(){
        a = new ArrayList();
    }
    public void addBebida(Bebida b){
        a.add(b);
    }
    public Bebida getBebida(){
        if (a.size() == 0)             // if(a.isEmpty()
            return null;
        else
            return a.remove(0);
    }
}