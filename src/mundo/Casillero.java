package mundo;

/**
 *
 * @author Tomás Chiriví
 */
public class Casillero <T> {

    private T producto;

    public Casillero() {
        producto = null;
    }

    public boolean agregar(T pProducto) {
        if (producto == null) {
            producto = pProducto;
            return true;
        }
        return false;
    }

    public T darProducto() {
        return producto;
    }

    public T despachar() {
        if (producto == null) {
            return producto;
        }

        T nObjeto = producto;
        producto = null;
        return nObjeto;
    }

    public boolean estaDesocupado() {

        if (producto == null) {
            return true;
        }
        return false;
    }

}

    
}
