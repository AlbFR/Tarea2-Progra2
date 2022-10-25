package tarea2.progra2;

import java.util.ArrayList;
import tarea2.progra2.exceptions.PagoIncorrectoException;
import tarea2.progra2.exceptions.NoHayBebidaException;

public class Expendedor {
   int precios[];
   int capacidad;
   DepositoMonedas vuelto;
   ArrayList<Deposito> depositos;

   public Expendedor (int capacidad, int precios[]) {
      this.precios = precios;
      this.capacidad = capacidad;
      this.depositos = new ArrayList<Deposito>();
      vuelto =  new DepositoMonedas();
      Deposito d = null;
      Bebida b = null;
      for (int i=0;i<3;++i) {
         d = new Deposito();
         for (int j=0;j<capacidad;++j) {
            if (i==0)
               b = new CocaCola(i*j + j);
            else if (i==1)
               b = new Fanta(i*j + j);
            else if (i==2)
               b = new Sprite(i*j + j);
            d.addBebida(b);
         }
         depositos.add(d);
      }
   }
   public Bebida atender(Moneda m, int tipo) {
      try {
         if (m == null) {
            throw new PagoIncorrectoException();
         }
         else if (m.getValor() >= precios[tipo]) {
            Bebida b = depositos.get(tipo).getBebida();
            if (b == null || tipo < 0 || 2 < tipo) {
               throw new NoHayBebidaException();
            }
            Moneda c = new Moneda100();
            for (int i=precios[tipo]/100; i<m.getValor()/100; i++){
                vuelto.addMoneda(c);
            }
            return b;
         }
         else if (m.getValor() < precios[tipo]) {
            throw new NoHayBebidaException();
         }
         return null;
      }
      catch (PagoIncorrectoException ex) {
         return null;
      }
      catch (NoHayBebidaException ex) {
         System.out.println("No Hay Bebida LoL");
         return null;
      }
   }
   public Moneda getVuelto(){
       return vuelto.getMoneda();
   }
}
