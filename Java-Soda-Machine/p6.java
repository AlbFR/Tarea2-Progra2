package a4;
import java.util.ArrayList;

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    
    public Expendedor(int a){
        coca = new Deposito();
        sprite = new Deposito();
        for(int i=0; i<a; i++){
            CocaCola aux1 = new CocaCola(i+100);
            coca.addBebida(aux1);
            Sprite aux2 = new Sprite(i+200);
            sprite.addBebida(aux2);
        }
    }
    public Bebida comprarBebida(Moneda a, int b ){
            Bebida take = null;
            if(b == 1){
                take = coca.getBebida();
            }
            if(b == 2){
                take = sprite.getBebida();
            }
            return take;
    }
}

class Moneda{
}

abstract class Bebida{
    private int serie;
    public Bebida(int a){
        serie = a;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return "sabor: ";
    }
}

class Sprite extends Bebida{
    public Sprite(int a){
        super(a);
    }
    @Override
    public String beber(){
        return super.beber() + "sprite";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }
    @Override
    public String beber(){
        return super.beber() + "cocacola";
    }
}

class Deposito{
    private final ArrayList<Bebida> a;
    public Deposito(){
        a = new ArrayList();
    }
    public void addBebida(Bebida b){
        a.add(b);
    }
    public Bebida getBebida(){
        if(a.size() == 0){              // if(a.isEmpty()){
            return null;

        }else{    
            Bebida aux = a.remove(0);
            return aux;
        }
    }
}

public class p6 {
    public static void main(String[] args) {
        Expendedor euf = new Expendedor(2);
        Moneda peso = new Moneda();
        Bebida aux;
        int serie;
        
        aux = euf.comprarBebida(peso, 1);
        aux.beber();
        serie = aux.getSerie();
        System.out.println(serie);
        System.out.println(aux);
        
        aux = euf.comprarBebida(peso, 1);
        aux.beber();
        serie = aux.getSerie();
        System.out.println(serie);
        System.out.println(aux);
        
        aux = euf.comprarBebida(peso, 2);
        aux.beber();
        serie = aux.getSerie();
        System.out.println(serie);
        System.out.println(aux);
        
        aux = euf.comprarBebida(peso, 2);
        aux.beber();
        serie = aux.getSerie();
        System.out.println(serie);
        System.out.println(aux);
        
        aux = euf.comprarBebida(peso, 2);
        System.out.println(aux);
    }    
}
