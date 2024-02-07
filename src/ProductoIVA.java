public abstract class ProductoIVA extends Producto {
    private double iva;

    public ProductoIVA(String descripcion, double precioBruto, double iva) {
        super(descripcion, precioBruto);
        this.iva = iva;
    }

    @Override
    public double getPrecioNeto() {
        return getPrecioBruto() + (getPrecioBruto() * this.iva / 100);
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" + %.1f%%",this.iva);
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        return true;
    }

    @Override
    public void cogerUnidad() {
        System.out.println("Se ha cogido una unidad");
    }

    @Override
    public double getPrecioVenta() {
        return getPrecioNeto();
    }
}
