public class MainProducto {
    public static void main(String[] args) {
        Producto p = new ProductoIVA("Teclado",8.99,18);
        System.out.println(p);
        Producto p1 = new ProductoGeneral("Teclado",8.99);
        System.out.println(p1);
        Producto p2 = new ProductoReducido("Teclado",8.99);
        System.out.println(p2);

        System.out.println(p.getPrecioNeto());
        System.out.println(p1.getPrecioNeto());
        System.out.println(p2.getPrecioNeto());
    }
}
