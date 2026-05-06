package cdt.bean;

import java.io.Serializable;

import cdt.modelo.CDT;
import cdt.modelo.CalculadoraCDT;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

/**
 * Controlador JSF del simulador de CDT.
 * Actúa como intermediario entre la vista (cdt.xhtml) y la lógica de negocio
 * (CalculadoraCDT). No contiene reglas de cálculo, únicamente coordina el flujo:
 * recibe los datos del formulario, invoca a la calculadora y expone el modelo
 * actualizado a la vista.
 */
@Named("cdt")
@ViewScoped
public class CDTBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private CDT modelo = new CDT();
	private final CalculadoraCDT calculadora = new CalculadoraCDT();

	public CDTBean() {
	}

	/**
	 * Acción del botón "Calcular Ganancia" en la vista.
	 * Delega el cálculo a la lógica de negocio.
	 */
	public void calcular() {
		calculadora.calcular(modelo);
		System.out.println("Cálculo realizado: " + modelo);
	}

	/**
	 * Limpia los datos del formulario para realizar un nuevo cálculo.
	 */
	public void limpiar() {
		this.modelo = new CDT();
	}

	// === Acceso al modelo desde la vista ===

	public CDT getModelo() {
		return modelo;
	}

	public void setModelo(CDT modelo) {
		this.modelo = modelo;
	}

	// === Getters/setters delegados (mantienen compatibilidad con la vista) ===

	public double getInversion() {
		return modelo.getInversion();
	}

	public void setInversion(double inversion) {
		modelo.setInversion(inversion);
	}

	public double getInteres() {
		return modelo.getInteres();
	}

	public void setInteres(double interes) {
		modelo.setInteres(interes);
	}

	public double getPlazo() {
		return modelo.getPlazo();
	}

	public void setPlazo(double plazo) {
		modelo.setPlazo(plazo);
	}

	public double getGanancia() {
		return modelo.getGanancia();
	}

	public double getValorFuturo() {
		return modelo.getValorFuturo();
	}

	public double getImpuesto() {
		return modelo.getImpuesto();
	}

	public double getGananciaNeta() {
		return modelo.getGananciaNeta();
	}

	public double getValorFinal() {
		return modelo.getValorFinal();
	}
}
