package tarea2.progra2;

public abstract class Bebida {
    private int serie;
    public Bebida(int a) {
        serie = a;
    }
    public int getSerie() {
        return serie;
    }
    public String beber() {
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
class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }
    @Override
    public String beber(){
        return super.beber() + "cocacola";
    }
}