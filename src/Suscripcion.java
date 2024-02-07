import exceptions.NoHayExistenciasException;

public class Suscripcion implements Comprable {
    private String descripcion;
    private int existencias;
    private double precio;

    public Suscripcion(String descripcion, int existencias, double precio) {
        setDescripcion(descripcion);
        setExistencias(existencias);
        setPrecio(precio);
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        return cantidad <= this.existencias;
    }

    @Override
    public void cogerUnidad() {
        if (this.existencias - 1 < 0) {
            throw new NoHayExistenciasException();
        }
        this.existencias--;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripción no puede estar en blanco");
        }
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        if (existencias < 0) {
            throw new IllegalArgumentException("No puede haber existencias negativas");
        }
        this.existencias = existencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio debe de ser mayor o igual que 0");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Suscripcion " + this.descripcion;
    }
}
