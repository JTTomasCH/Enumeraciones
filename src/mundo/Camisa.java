
package mundo;

/**
 *
 * @author Tomás Chiriví
 */
public class Camisa extends Vestuario{
		
	public enum Marca{
		GEF,POLO,NAUTICA
	}

	
	private String marca;
	
	public Camisa(String pMarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pMarca;
	}
	
	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}
