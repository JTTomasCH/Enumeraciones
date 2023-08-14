
package mundo;

/**
 *
 * @author Tomás Chiriví
 */
public class Vestuario extends Producto{
	
	public enum Talla{
		
		XS, S, M, L, XL, XXL, XXXL
	}
	
	protected Talla talla;
	
	public Vestuario(Talla pTalla, double pPrecio)
	{
		super(pPrecio);
		talla = pTalla;
		
	}

}
