/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author Tomás Chiriví
 */
public class Celular extends Electronico{
	
	public enum Operador
	{
		CLARO, TIGO, VIRGIN, MOVISTAR, ETB, NINGUNO
	}
	
	public Operador operador;
	
	public Celular(Gama pGama, double pPrecio, Operador pOperador)
	{
		super(pGama, pPrecio);
		operador = pOperador;
	}
	
	public String toString()
	{
		return "Celular "+operador.name()+" - "+"Gama "+gama;
	}

}