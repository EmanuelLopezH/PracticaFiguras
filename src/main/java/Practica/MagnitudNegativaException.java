
package Practica;


public class MagnitudNegativaException extends Exception {

    public MagnitudNegativaException() {
        super("RadioNegativoException: Intentó asignar una magnitud negativa");
    }
}