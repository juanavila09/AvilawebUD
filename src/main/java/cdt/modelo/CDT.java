package cdt.modelo;

import java.io.Serializable;

/**
 * Modelo de datos de un Certificado de Depósito a Término (CDT).
 * Esta clase representa únicamente la estructura de datos, sin lógica de negocio
 * ni dependencias del framework de presentación (JSF).
 */
public class CDT implements Serializable {

	private static final long serialVersionUID = 1L;

	private double inversion;
	private double interes;
	private double plazo;
	private double ganancia;
	private double valorFuturo;
	private double impuesto;

	public CDT() {
	}

	public CDT(double inversion, double interes, double plazo) {
		this.inversion = inversion;
		this.interes = interes;
		this.plazo = plazo;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getPlazo() {
		return plazo;
	}

	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}

	public double getGanancia() {
		return ganancia;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}

	public double getValorFuturo() {
		return valorFuturo;
	}

	public void setValorFuturo(double valorFuturo) {
		this.valorFuturo = valorFuturo;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	/**
	 * Devuelve la ganancia neta del CDT después de aplicar el impuesto del 4%.
	 */
	public double getGananciaNeta() {
		return ganancia - impuesto;
	}

	/**
	 * Devuelve el valor final al vencimiento (valor futuro menos impuesto).
	 */
	public double getValorFinal() {
		return valorFuturo - impuesto;
	}

	@Override
	public String toString() {
		return "CDT [inversion=" + inversion + ", interes=" + interes + ", plazo=" + plazo
				+ ", ganancia=" + ganancia + ", valorFuturo=" + valorFuturo + ", impuesto=" + impuesto + "]";
	}
}
