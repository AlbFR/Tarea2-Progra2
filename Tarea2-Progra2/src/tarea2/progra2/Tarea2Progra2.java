package tarea2.progra2;

public class Tarea2Progra2 {
    public static void main(String[] args) {
        // Deposito d = new Deposito();
        // Bebida b = new Sprite(1);
        // d.addBebida(b);
        // b = d.getBebida();
        // System.out.println(b.beber());


        Moneda m = new Moneda1000();
        int p[] = {1000, 900, 1000};
        Expendedor e = new Expendedor(3, p);
        Comprador mirro = new Comprador(m, 1, e);
        System.out.println(mirro.getSabor());
        System.out.println("Vuelto: "+mirro.getVuelto());
    }
}