package tarea2.progra2;

public class Comprador {
   private Moneda m;
   private int tipoBebida;
   private Expendedor exp;
   public Comprador(Moneda m, int tipo, Expendedor exp) {
      this.m = m;
      this.tipoBebida = tipo;
      this.exp = exp;
   }
}
