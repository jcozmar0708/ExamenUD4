package exceptions;

public class NoHayExistenciasException extends IllegalArgumentException {
    public NoHayExistenciasException() {
        this("No quedan más existencias");
    }

    public NoHayExistenciasException(String mensaje) {
        super(mensaje);
    }
}
