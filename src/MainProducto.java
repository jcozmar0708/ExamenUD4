import exceptions.PresupuestoInsuficienteException;

public class MainProducto {
    public static void main(String[] args) throws PresupuestoInsuficienteException {
        Producto p = new ProductoGeneral("PC Portátil",1000);
        Suscripcion s = new Suscripcion("Netflix",4,12.99);
        Suscripcion s1 = new Suscripcion("Netflix",4,12.99);
        Suscripcion s2 = new Suscripcion("Netflix",4,12.99);
        Producto p1 = new ProductoReducido("1 kg. patatas",1.2);
        CestaCompra c = new CestaCompra(1300);
        c.addElemento(p);
        c.addElemento(s);
        c.addElemento(s1);
        c.addElemento(s2);
        c.addElemento(p1);
        c.imprimir();
    }
}
