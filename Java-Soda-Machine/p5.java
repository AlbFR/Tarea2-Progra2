package a4;
import java.util.ArrayList;

class Bebida{
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
class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }
    @Override
    public String beber(){
        return super.beber() + "fanta";
    }
}
class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }
    @Override   
    public String beber(){
        return super.beber() + "kem";
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

public class p5 {
    public static void main(String[] args) {
        Deposito euf1 = new Deposito();
        Deposito euf2 = new Deposito();
        
        Bebida soda1 = new CocaCola(1);
        Bebida soda2 = new Sprite(2);
        Bebida soda3 = new Kem(3);
        Bebida soda4 = new Fanta(4);
        
        euf1.addBebida(soda1);
        euf1.addBebida(soda2);
        euf2.addBebida(soda3);
        euf2.addBebida(soda4);
        
        Bebida take = euf1.getBebida();
        System.out.println(take);
        
        take = euf1.getBebida();
        System.out.println(take);
        
        take = euf2.getBebida();
        System.out.println(take);
        
        take = euf2.getBebida();
        System.out.println(take);
        
        take = euf2.getBebida();
        System.out.println(take);
    }    
}

