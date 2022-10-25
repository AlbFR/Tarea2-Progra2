package tarea2.progra2;

public class Comprador {
   private String sabor;
   private int vuelto;
   public Comprador(Moneda m, int tipo, Expendedor exp) {
      Bebida b = exp.atender(m, tipo);
      if (b != null) {
         sabor = b.beber();
         vuelto = 0;
         Moneda c = exp.getVuelto();
         while (c != null) {
            vuelto += c.getValor();
            c = exp.getVuelto();
         }
      }
   }
   public String getSabor() {
      return this.sabor;
   }
   public int getVuelto() {
      return this.vuelto;
   }
}