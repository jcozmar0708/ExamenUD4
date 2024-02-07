import exceptions.PresupuestoInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class CestaCompra {
    private double presupuesto;
    private List<Comprable> productos_comprables;

    public CestaCompra(double presupuesto) {
        this.presupuesto = presupuesto;
        this.productos_comprables = new ArrayList<>();
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public List<Comprable> getCesta() {
        return List.copyOf(this.productos_comprables);
    }

    public void addElemento(Comprable comprable) throws PresupuestoInsuficienteException {
        if (comprable.getPrecioVenta() + getPrecioCesta() > this.presupuesto) {
            throw new PresupuestoInsuficienteException();
        }
        this.productos_comprables.add(comprable);
    }

    public double getPrecioCesta() {
        double precio_total = 0;
        for (Comprable c : this.productos_comprables) {
            precio_total += c.getPrecioVenta();
        }
        return precio_total;
    }

    public void imprimir() {
        System.out.println("CESTA DE LA COMPRA");
        for (Comprable c : this.productos_comprables) {
            System.out.print(c);
            System.out.println(" = " + c.getPrecioVenta());
        }
        System.out.println("SUMA: " + String.format("%.2f",getPrecioCesta()));
        System.out.println("PRESUPUESTO: " + String.format("%.2f",getPresupuesto()));
        System.out.println("RESTANTE: " + String.format("%.2f",(getPresupuesto() - getPrecioCesta())));
    }
}
