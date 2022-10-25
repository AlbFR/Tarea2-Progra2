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
        System.out.println("Comprador 1:");
        Comprador mirro = new Comprador(m, 1, e);
        System.out.println(mirro.getSabor());
        System.out.println("Vuelto: "+mirro.getVuelto());

        System.out.println("Comprador 2:");
        Moneda c = new Moneda500();
        Comprador yo = new Comprador(c, 1, e);
        System.out.println(yo.getSabor());
        System.out.println(yo.getSabor());

        System.out.println("Comprador 3:");

        Comprador x = new Comprador(m, 1, e);
        System.out.println(x.getSabor());
        System.out.println(x.getSabor());
    }
}