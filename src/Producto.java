public abstract class Producto implements Comprable {
    private String descripcion;
    private double precioBruto;

    public Producto(String descripcion, double precioBruto) {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcón no puede estar vacía");
        }
        if (precioBruto < 0) {
            throw new IllegalArgumentException("El precio bruto debe de ser mayor o igual que 0");
        }
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public abstract double getPrecioNeto();

    @Override
    public String toString() {
        return this.descripcion + String.format(": %.2f €",this.precioBruto);
    }


}
