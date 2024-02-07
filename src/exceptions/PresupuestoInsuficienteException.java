package exceptions;

public class PresupuestoInsuficienteException extends Exception {
    public PresupuestoInsuficienteException() {
        this("Presupuesto insuficiente");
    }

    public PresupuestoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
