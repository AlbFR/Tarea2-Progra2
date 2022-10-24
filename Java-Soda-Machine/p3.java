package a4;

abstract class Bebida{
    private int serie;
    public Bebida(int a){
        serie = a;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}

class Sprite extends Bebida{
    public Sprite(int a){
        super(a);
    }
    @Override
    public String beber(){
        return "sprite";
    }
}
class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }
    @Override
    public String beber(){
        return "fanta";
    }
}
class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }
    @Override
    public String beber(){
        return "kem";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }
    @Override
    public String beber(){
        return "cocacola";
    }
}

class CreaYPruebaBebida{
    public static void pruebaVerSerieBebe(int soda, int serie){
    Bebida b;
        switch (soda){
            case 1:  b = new Sprite(serie); break;
              case 2:  b = new Fanta(serie); break;
              case 3:  b = new Kem(serie); break;
              case 4:  b = new CocaCola(serie); break;
              default: return;
          }
        System.out.println(b.getSerie()+": "+b.beber());
      }
}

public class p3 {
    public static void main(String[] args) {
        CreaYPruebaBebida euf = new CreaYPruebaBebida();
        euf.pruebaVerSerieBebe(2, 20);
    }    
}
