
package mundo;

/**
 *
 * @author Tomás Chiriví
 */
public class Computador extends Electronico{
    
    public enum SistemaOperativo
	{
		WINDOWS, LINUX, MasOS, 
	}
	
	public SistemaOperativo sistemaOperativo;
	
	public Computador(Gama pGama, double pPrecio, SistemaOperativo sOperativo)
	{
		super(pGama, pPrecio);
		sistemaOperativo = sOperativo;
	}
	
	public String toString()
	{
		return "Computador "+sistemaOperativo.name()+" - "+"Gama "+gama;
	}


}
