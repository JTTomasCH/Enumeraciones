
package mundo;

/**
 *
 * @author Tomás Chiriví
 */
public class Electronico extends Producto{
	
	public enum  Gama {
		ALTA, MEDIA, BAJA
	}
	
	public Gama gama;
	
	public Electronico(Gama pGama,double pPrecio)
	{
		super(pPrecio);
		gama = pGama;
	}

}
